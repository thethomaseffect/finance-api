package financeapi.models;

import financeapi.enums.DataEntryTypes;

public class DataEntryModel_Impl implements DataEntryModel {
    DataEntryTypes dataEntryType;
    String id;
    Integer version;
    String organisationID;
    DataEntryAttributesModel attributes;

    public DataEntryModel_Impl(DataEntryTypes dataEntryType, String id, Integer version, String organisationID,
                               DataEntryAttributesModel attributes) {
        this.dataEntryType = dataEntryType;
        this.id = id;
        this.version = version;
        this.organisationID = organisationID;
        this.attributes = attributes;
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
    public DataEntryAttributesModel getAttributes() {
        return attributes;
    }
}
