package com.example.demo.mapper;

import com.example.demo.destination.RMultipleItems;
import com.example.demo.source.MultipleElements;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface MultipleMapper {

    MultipleMapper INSTANCE = Mappers.getMapper(MultipleMapper.class);


    @Mappings(
            {
                    @Mapping(source = "name", target = "name"),
                    @Mapping(source = "href", target = "href")
            }
    )
    RMultipleItems convert(MultipleElements multipleElements);
}
