
package com.mycompany.vdm.namespaces.socialnetworkaccount;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SocialNetworkAccountFluentHelper
    extends FluentHelperRead<SocialNetworkAccountFluentHelper, SocialNetworkAccount, SocialNetworkAccountSelectable>
{


    @Override
    protected Class<SocialNetworkAccount> getEntityClass() {
        return SocialNetworkAccount.class;
    }

}
