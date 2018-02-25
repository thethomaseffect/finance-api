package financeapi.models;

import java.util.List;

public class PaymentsModel_Impl implements PaymentsModel {

    private List<DataEntryModel_Impl> data;
    private LinksModel links;

    public PaymentsModel_Impl(List<DataEntryModel_Impl> data, LinksModel links) {
        this.data = data;
        this.links = links;
    }

    public PaymentsModel_Impl() {
    }

    @Override
    public List<DataEntryModel_Impl> getData() {
        return data;
    }

    @Override
    public LinksModel getLinks() {
        return links;
    }
}
