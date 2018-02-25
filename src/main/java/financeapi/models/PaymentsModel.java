package financeapi.models;

import java.util.List;

public interface PaymentsModel {
    List<DataEntryModel_Impl> getData();
    LinksModel getLinks();
}
