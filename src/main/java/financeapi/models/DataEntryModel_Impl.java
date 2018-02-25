package financeapi.models;

import financeapi.enums.DataEntryTypes;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class DataEntryModel_Impl implements DataEntryModel {
    @NotNull
    @Enumerated(EnumType.STRING)
    DataEntryTypes dataEntryType;
    @Id
    String id;
    @NotNull
    Integer version;
    @NotNull
    String organisationID;
    @NotNull
    @Embedded
    PaymentAttributesModel_Impl attributes;

    @Autowired
    public DataEntryModel_Impl(DataEntryTypes dataEntryType, String id, Integer version, String organisationID,
                               PaymentAttributesModel_Impl attributes) {
        this.dataEntryType = dataEntryType;
        this.id = id;
        this.version = version;
        this.organisationID = organisationID;
        this.attributes = attributes;
    }

    public DataEntryModel_Impl() {
    }

    @Override
    public DataEntryTypes getType() {
        return dataEntryType;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public Integer getVersion() {
        return version;
    }

    @Override
    public String getOrganisationID() {
        return organisationID;
    }

    @Override
    public PaymentAttributesModel getAttributes() {
        return attributes;
    }
}
