package com.example.demo.service;

import com.example.demo.dao.LogicalResourceDao;
import com.example.demo.dao.ResourceCatalogRepository;
import com.example.demo.dto.LRR;
import com.example.demo.dto.LRRI;
import com.example.demo.dto.Lr;
import com.example.demo.entity.ConfigurationSpecification;
import com.example.demo.entity.LogicalResource;
import com.example.demo.entity.ResourceCandidate;
import com.example.demo.entity.ResourceCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UpdateService {


    private final LogicalResourceDao logicalResourceDao;
    private final ResourceCatalogRepository resourceCatalogRepository;
    @Autowired
    public UpdateService(LogicalResourceDao logicalResourceDao, ResourceCatalogRepository resourceCatalogRepository) {
        this.logicalResourceDao = logicalResourceDao;
        this.resourceCatalogRepository = resourceCatalogRepository;
    }


    public Mono<LRR> update(Mono<LRR> lrrMono) {

        try {
            Mono<LRR> x = lrrMono.flatMap(lrr -> {
                return Flux.fromIterable(lrr.getLrris())
                        .flatMap(lrri -> {
                            return Flux.fromIterable(lrri.getLrs())
                                    .flatMap(lr -> {
                                        return logicalResourceDao.findById(lr.getId())
                                                .flatMap(ex -> {
                                                    updateResource(lr, ex);
                                                    return getLr(lr,ex);
                                                });
                                    })
                                    .collectList()
                                    .map(lrList -> {
                                        lrri.setLrs(lrList);
                                        return lrri;
                                    });
                        })
                        .collectList()
                        .map(lrriList -> {
                            lrr.setLrris(lrriList);
                            return lrr;
                        });
            });

            return x;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }

    private Mono<Lr> getLr(Lr lr, LogicalResource ex) {
        System.out.println(ex.getResourceStatus());
        lr.setResourceStatus(ex.getResourceStatus());
        return Mono.just(lr);
    }

    private void updateResource(Lr lr, LogicalResource ex) {

        ex.setResourceStatus("nextStatus,");
        logicalResourceDao.save(ex).subscribe();
        System.out.println(ex.getSpecId());
        Mono<ConfigurationSpecification> x = resourceCatalogRepository.findAll()
                .flatMapIterable(ResourceCatalog::getResourceCandidateList)
                .filter(resourceCandidate -> resourceCandidate.getResourceSpecification()!=null && resourceCandidate.getResourceSpecification()
                        .getSpecificationId().equals(ex.getSpecId()))
                .map(ResourceCandidate::getConfigurationSpecification)
                .next();
        x.subscribe(y -> System.out.println("configuration id ::"+y.getConfigId()));

    }
}
