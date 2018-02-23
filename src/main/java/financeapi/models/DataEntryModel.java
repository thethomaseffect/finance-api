package financeapi.models;

import financeapi.enums.DataEntryTypes;

public interface DataEntryModel {
    DataEntryTypes getType();

    String getID();

    Integer getVersion();

    String getOrganisationID();

    DataEntryAttributesModel getAttributes();
}
