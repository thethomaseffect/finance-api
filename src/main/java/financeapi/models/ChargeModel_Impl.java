package financeapi.models;

public class ChargeModel_Impl implements ChargeModel {

    private String amount;
    private String currency;

    public ChargeModel_Impl(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public String getCurrency() {
        return currency;
    }
}
