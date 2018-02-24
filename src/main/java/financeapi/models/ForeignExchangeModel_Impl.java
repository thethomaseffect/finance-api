package financeapi.models;

public class ForeignExchangeModel_Impl implements ForeignExchangeModel {

    private String contractReference;
    private String exchangeRate;
    private String originalAmount;
    private String originalCurrency;

    public ForeignExchangeModel_Impl(String contractReference, String exchangeRate, String originalAmount, String
            originalCurrency) {
        this.contractReference = contractReference;
        this.exchangeRate = exchangeRate;
        this.originalAmount = originalAmount;
        this.originalCurrency = originalCurrency;
    }

    @Override
    public String getContractReference() {
        return contractReference;
    }

    @Override
    public String getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String getOriginalAmount() {
        return originalAmount;
    }

    @Override
    public String getOriginalCurrency() {
        return originalCurrency;
    }
}
