package financeapi.models;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class ForeignExchangeModel_Impl implements ForeignExchangeModel {

    @NotNull
    private String contractReference;
    @NotNull
    private String exchangeRate;
    @NotNull
    private String originalAmount;
    @NotNull
    private String originalCurrency;

    public ForeignExchangeModel_Impl(String contractReference, String exchangeRate, String originalAmount, String
            originalCurrency) {
        this.contractReference = contractReference;
        this.exchangeRate = exchangeRate;
        this.originalAmount = originalAmount;
        this.originalCurrency = originalCurrency;
    }

    public ForeignExchangeModel_Impl() {
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
