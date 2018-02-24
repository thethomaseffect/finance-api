package financeapi.models;

public class LinksModel_Impl implements LinksModel {

    private String self;

    public LinksModel_Impl(String self) {
        this.self = self;
    }

    @Override
    public String getSelf() {
        return self;
    }
}
