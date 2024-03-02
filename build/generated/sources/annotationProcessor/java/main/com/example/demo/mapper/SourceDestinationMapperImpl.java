package com.example.demo.mapper;

import com.example.demo.destination.Destination;
import com.example.demo.destination.RMultipleItems;
import com.example.demo.source.MultipleElements;
import com.example.demo.source.Source;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-09T22:42:51+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class SourceDestinationMapperImpl implements SourceDestinationMapper {

    @Autowired
    private MultipleMapper multipleMapper;
    @Autowired
    private CharacMapper characMapper;

    @Override
    public Destination convert(Source source) {
        if ( source == null ) {
            return null;
        }

        Destination destination = new Destination();

        destination.setRMultipleItemsList( multipleElementsListToRMultipleItemsList( source.getMultipleElements() ) );
        destination.setValue( source.getId() );
        destination.setRoCharacteristicsList( characMapper.convertObjToList( source.getCharacteristics() ) );
        destination.setName( source.getName() );
        destination.setAtType( source.getAtType() );

        return destination;
    }

    protected List<RMultipleItems> multipleElementsListToRMultipleItemsList(List<MultipleElements> list) {
        if ( list == null ) {
            return null;
        }

        List<RMultipleItems> list1 = new ArrayList<RMultipleItems>( list.size() );
        for ( MultipleElements multipleElements : list ) {
            list1.add( multipleMapper.convert( multipleElements ) );
        }

        return list1;
    }
}
