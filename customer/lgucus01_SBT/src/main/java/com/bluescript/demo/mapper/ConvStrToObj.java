package com.bluescript.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.InheritInverseConfiguration;
import com.bluescript.demo.model.CaCustomerRequest;

@Mapper
public interface ConvStrToObj {
    @Mapping(target = "caFirstName", expression = "java(caRequestSpecific.substring(0,10))")
    @Mapping(target = "caLastName", expression = "java(caRequestSpecific.substring(10,30))")
    @Mapping(target = "caDob", expression = "java(caRequestSpecific.substring(30,40))")
    @Mapping(target = "caHouseName", expression = "java(caRequestSpecific.substring(40,60))")
    @Mapping(target = "caHouseNum", expression = "java(caRequestSpecific.substring(60,64))")
    @Mapping(target = "caPostcode", expression = "java(caRequestSpecific.substring(64,72))")
    @Mapping(target = "caNumPolicies", expression = "java(Integer.parseInt(caRequestSpecific.substring(72,75)))")
    @Mapping(target = "caPhoneMobile", expression = "java(caRequestSpecific.substring(75,95))")
    @Mapping(target = "caPhoneHome", expression = "java(caRequestSpecific.substring(95,115))")
    @Mapping(target = "caEmailAddress", expression = "java(caRequestSpecific.substring(115,215))")
    @Mapping(target = "caPolicyData", expression = "java(caRequestSpecific.substring(215,32482))")
    CaCustomerRequest caRequestSpecificTocaCustomerRequest_1(String caRequestSpecific,
            @MappingTarget CaCustomerRequest caCustomerRequest);

}