
package com.mycompany.vdm.namespaces.socialnetworkaccount;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.mycompany.vdm.namespaces.socialnetworkaccount.SocialNetworkAccount SocialNetworkAccount} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class SocialNetworkAccountLink<ObjectT extends VdmObject<?> >
    extends EntityLink<SocialNetworkAccountLink<ObjectT> , SocialNetworkAccount, ObjectT>
    implements SocialNetworkAccountSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public SocialNetworkAccountLink(final String fieldName) {
        super(fieldName);
    }

    private SocialNetworkAccountLink(final EntityLink<SocialNetworkAccountLink<ObjectT> , SocialNetworkAccount, ObjectT> toClone) {
        super(toClone);
    }

    @Override
    protected SocialNetworkAccountLink<ObjectT> translateLinkType(final EntityLink<SocialNetworkAccountLink<ObjectT> , SocialNetworkAccount, ObjectT> link) {
        return new SocialNetworkAccountLink<ObjectT>(link);
    }

}
