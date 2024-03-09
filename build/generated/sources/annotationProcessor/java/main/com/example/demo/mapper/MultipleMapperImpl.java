package com.example.demo.mapper;

import com.example.demo.destination.RMultipleItems;
import com.example.demo.source.MultipleElements;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T23:47:53+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class MultipleMapperImpl implements MultipleMapper {

    @Override
    public RMultipleItems convert(MultipleElements multipleElements) {
        if ( multipleElements == null ) {
            return null;
        }

        RMultipleItems rMultipleItems = new RMultipleItems();

        rMultipleItems.setName( multipleElements.getName() );
        rMultipleItems.setHref( multipleElements.getHref() );

        return rMultipleItems;
    }
}
