
package com.mycompany.vdm.services;

import java.util.UUID;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountByKeyFluentHelper;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountCreateFluentHelper;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountDeleteFluentHelper;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountFluentHelper;
import com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountUpdateFluentHelper;


/**
 * <p>Reference: <a href='https://api.sap.com/shell/discover/contentpackage/SAPS4HANACloud/api/SocialNetworkAccount?section=OVERVIEW'>SAP API Business Hub</a></p><h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>SocialNetworkAccount</td></tr></table>
 * 
 */
public interface SocialnetworkaccountService {


    /**
     * Fetch multiple {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SocialNetworkAccountFluentHelper getAllSocialNetworkAccount();

    /**
     * Fetch a single {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity using key fields.
     * 
     * @param uUID
     *      16 Byte UUID in 16 Bytes (Raw Format)<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SocialNetworkAccountByKeyFluentHelper getSocialNetworkAccountByKey(UUID uUID);

    /**
     * Create a new {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity and save it to the S/4HANA system.
     * 
     * @param socialNetworkAccount
     *     {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity. To perform execution, call the {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SocialNetworkAccountCreateFluentHelper createSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount);

    /**
     * Update an existing {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity and save it to the S/4HANA system.
     * 
     * @param socialNetworkAccount
     *     {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity. To perform execution, call the {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SocialNetworkAccountUpdateFluentHelper updateSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount);

    /**
     * Deletes an existing {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity in the S/4HANA system.
     * 
     * @param socialNetworkAccount
     *     {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} entity. To perform execution, call the {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccountDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SocialNetworkAccountDeleteFluentHelper deleteSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount);

}
