package com.example.demo.mapper;

import com.example.demo.destination.ROCharacteristics;
import com.example.demo.source.RCharacteristics;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacMapper {

    default List<ROCharacteristics> convertObjToList(RCharacteristics rCharacteristics) {
        List<ROCharacteristics> roCharacteristics = new ArrayList<>();
        roCharacteristics.add(ROCharacteristics.builder().name(rCharacteristics.getProductcode().getName()).value(rCharacteristics.getProductcode().getValue()).valueType(rCharacteristics.getProductcode().getValueType()).build());
        roCharacteristics.add(ROCharacteristics.builder().name(rCharacteristics.getNextcode().getName()).value(rCharacteristics.getNextcode().getValue()).valueType(rCharacteristics.getNextcode().getValueType()).build());
        roCharacteristics.add(ROCharacteristics.builder().name(rCharacteristics.getGeocode().getName()).value(rCharacteristics.getGeocode().getValue()).valueType(rCharacteristics.getGeocode().getValueType()).build());
        return roCharacteristics;
    }

}
