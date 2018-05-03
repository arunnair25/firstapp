
package com.mycompany.vdm.namespaces.socialnetworkaccount;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Social Network Account<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SocialNetworkAccount
    extends VdmEntity<SocialNetworkAccount>
{

    /**
     * Selector for all available fields of SocialNetworkAccount.
     * 
     */
    public final static SocialNetworkAccountSelectable ALL_FIELDS = new SocialNetworkAccountSelectable() {


        @Override
        public String getFieldName() {
            return "*";
        }

        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable
     * 
     * @param uUID
     *     
     * @return
     *      16 Byte UUID in 16 Bytes (Raw Format)
     */
    @SerializedName("SAP_UUID")
    @JsonProperty("SAP_UUID")
    @Nullable
    private java.util.UUID uUID;
    /**
     * Use with available fluent helpers to apply the <b>SAP_UUID</b> field to query operations.
     * 
     */
    public final static SocialNetworkAccountField<java.util.UUID> UUID = new SocialNetworkAccountField<java.util.UUID>("SAP_UUID");
    /**
     * Constraints: Not nullable, Maximum length: 20
     * 
     * @param iD
     *     
     * @return
     *     ID
     */
    @SerializedName("ID")
    @JsonProperty("ID")
    @Nullable
    private String iD;
    /**
     * Use with available fluent helpers to apply the <b>ID</b> field to query operations.
     * 
     */
    public final static SocialNetworkAccountField<String> ID = new SocialNetworkAccountField<String>("ID");
    /**
     * Constraints: Not nullable, Maximum length: 20
     * 
     * @param provider
     *     
     * @return
     *     Provider
     */
    @SerializedName("Provider")
    @JsonProperty("Provider")
    @Nullable
    private String provider;
    /**
     * Use with available fluent helpers to apply the <b>Provider</b> field to query operations.
     * 
     */
    public final static SocialNetworkAccountField<String> PROVIDER = new SocialNetworkAccountField<String>("Provider");
    /**
     * Constraints: Not nullable, Maximum length: 20
     * 
     * @param account
     *     
     * @return
     *     Account
     */
    @SerializedName("Account")
    @JsonProperty("Account")
    @Nullable
    private String account;
    /**
     * Use with available fluent helpers to apply the <b>Account</b> field to query operations.
     * 
     */
    public final static SocialNetworkAccountField<String> ACCOUNT = new SocialNetworkAccountField<String>("Account");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SocialNetworkAccount> getType() {
        return SocialNetworkAccount.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/YY1_SOCIALNETWORKACCOUNT_CDS";
    }

    @Override
    protected String getEntityCollection() {
        return "YY1_SOCIALNETWORKACCOUNT";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SAP_UUID", getUUID());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SAP_UUID", getUUID());
        values.put("ID", getID());
        values.put("Provider", getProvider());
        values.put("Account", getAccount());
        // navigation properties
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("SAP_UUID")) {
                final Object value = values.remove("SAP_UUID");
                if ((value == null)||(!value.equals(getUUID()))) {
                    setUUID(((java.util.UUID) value));
                }
            }
            if (values.containsKey("ID")) {
                final Object value = values.remove("ID");
                if ((value == null)||(!value.equals(getID()))) {
                    setID(((String) value));
                }
            }
            if (values.containsKey("Provider")) {
                final Object value = values.remove("Provider");
                if ((value == null)||(!value.equals(getProvider()))) {
                    setProvider(((String) value));
                }
            }
            if (values.containsKey("Account")) {
                final Object value = values.remove("Account");
                if ((value == null)||(!value.equals(getAccount()))) {
                    setAccount(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    public static<T >SocialNetworkAccountField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SocialNetworkAccountField<T>(fieldName);
    }

}
