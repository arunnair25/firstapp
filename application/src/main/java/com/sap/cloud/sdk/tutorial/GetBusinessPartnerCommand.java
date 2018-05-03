package com.sap.cloud.sdk.tutorial;

import org.slf4j.Logger;

import java.util.Collections;
import java.util.List;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.ErpCommand;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.Order;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.BusinessPartnerService;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;

public class GetBusinessPartnerCommand extends ErpCommand<List<BusinessPartner>> {

    private BusinessPartnerService businessPartnerService;

    public GetBusinessPartnerCommand(ErpConfigContext erpConfigContext, BusinessPartnerService businessPartnerService) {
        super(GetBusinessPartnerCommand.class, erpConfigContext);
        this.businessPartnerService = businessPartnerService;
    }

    @Override
    protected List<BusinessPartner> run() {

        try {

            return businessPartnerService.getAllBusinessPartner()
                        .filter(BusinessPartner.IS_NATURAL_PERSON.eq("X"))
                        .select(BusinessPartner.FIRST_NAME,
                                BusinessPartner.LAST_NAME)
                        .execute(getConfigContext());

        } catch (final ODataException e) {
            throw new HystrixBadRequestException(e.getMessage(), e);
        }
    }
}