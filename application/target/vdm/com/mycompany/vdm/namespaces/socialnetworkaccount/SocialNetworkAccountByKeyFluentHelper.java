
package com.mycompany.vdm.namespaces.socialnetworkaccount;

import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SocialNetworkAccountByKeyFluentHelper
    extends FluentHelperByKey<SocialNetworkAccountByKeyFluentHelper, SocialNetworkAccount, SocialNetworkAccountSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param uUID
     *      16 Byte UUID in 16 Bytes (Raw Format)<p>Constraints: Not nullable</p>
     */
    public SocialNetworkAccountByKeyFluentHelper(UUID uUID) {
        key.put("SAP_UUID", uUID);
    }

    @Override
    protected Class<SocialNetworkAccount> getEntityClass() {
        return SocialNetworkAccount.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
