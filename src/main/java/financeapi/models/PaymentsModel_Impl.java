package financeapi.models;

import java.util.List;

public class PaymentsModel_Impl implements PaymentsModel {

    private List<DataEntryModel> data;
    private LinksModel links;

    public PaymentsModel_Impl(List<DataEntryModel> data, LinksModel links) {
        this.data = data;
        this.links = links;
    }

    @Override
    public List<DataEntryModel> getData() {
        return data;
    }

    @Override

    public LinksModel getLinks() {
        return links;
    }
}
