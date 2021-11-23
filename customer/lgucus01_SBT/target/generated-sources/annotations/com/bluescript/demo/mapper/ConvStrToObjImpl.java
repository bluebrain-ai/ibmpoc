package com.bluescript.demo.mapper;

import com.bluescript.demo.model.CaCustomerRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 14 (Oracle Corporation)"
)
@Component
public class ConvStrToObjImpl implements ConvStrToObj {

    @Override
    public CaCustomerRequest caRequestSpecificTocaCustomerRequest_1(String caRequestSpecific, CaCustomerRequest caCustomerRequest) {
        if ( caRequestSpecific == null ) {
            return null;
        }

        caCustomerRequest.setCaFirstName( caRequestSpecific.substring(0,10) );
        caCustomerRequest.setCaLastName( caRequestSpecific.substring(10,30) );
        caCustomerRequest.setCaDob( caRequestSpecific.substring(30,40) );
        caCustomerRequest.setCaHouseName( caRequestSpecific.substring(40,60) );
        caCustomerRequest.setCaHouseNum( caRequestSpecific.substring(60,64) );
        caCustomerRequest.setCaPostcode( caRequestSpecific.substring(64,72) );
        caCustomerRequest.setCaNumPolicies( Integer.parseInt(caRequestSpecific.substring(72,75)) );
        caCustomerRequest.setCaPhoneMobile( caRequestSpecific.substring(75,95) );
        caCustomerRequest.setCaPhoneHome( caRequestSpecific.substring(95,115) );
        caCustomerRequest.setCaEmailAddress( caRequestSpecific.substring(115,215) );
        caCustomerRequest.setCaPolicyData( caRequestSpecific.substring(215,32482) );

        return caCustomerRequest;
    }
}
