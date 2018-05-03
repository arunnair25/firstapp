
package com.mycompany.vdm.services;

import java.util.UUID;
import javax.inject.Named;
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
@Named("com.mycompany.vdm.services.DefaultSocialnetworkaccountService")
public class DefaultSocialnetworkaccountService
    implements SocialnetworkaccountService
{


    @Override
    public SocialNetworkAccountFluentHelper getAllSocialNetworkAccount() {
        return new SocialNetworkAccountFluentHelper();
    }

    @Override
    public SocialNetworkAccountByKeyFluentHelper getSocialNetworkAccountByKey(UUID uUID) {
        return new SocialNetworkAccountByKeyFluentHelper(uUID);
    }

    @Override
    public SocialNetworkAccountCreateFluentHelper createSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount) {
        return new SocialNetworkAccountCreateFluentHelper(socialNetworkAccount);
    }

    @Override
    public SocialNetworkAccountUpdateFluentHelper updateSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount) {
        return new SocialNetworkAccountUpdateFluentHelper(socialNetworkAccount);
    }

    @Override
    public SocialNetworkAccountDeleteFluentHelper deleteSocialNetworkAccount(final SocialNetworkAccount socialNetworkAccount) {
        return new SocialNetworkAccountDeleteFluentHelper(socialNetworkAccount);
    }

}
