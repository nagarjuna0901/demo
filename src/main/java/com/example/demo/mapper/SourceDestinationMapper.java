package com.example.demo.mapper;

import com.example.demo.destination.Destination;
import com.example.demo.source.Source;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.beans.JavaBean;
import java.util.Arrays;

@Mapper(componentModel = "spring", uses = {MultipleMapper.class , CharacMapper.class}  )
public interface SourceDestinationMapper {

    SourceDestinationMapper INSTANCE = Mappers.getMapper(SourceDestinationMapper.class);


    @Mappings(
            {
                    @Mapping(source = "multipleElements", target = "RMultipleItemsList"),
                    @Mapping(source = "id", target = "value"),
                    @Mapping(target = "roCharacteristicsList", source = "characteristics")
            })
    Destination convert(Source source);
}
