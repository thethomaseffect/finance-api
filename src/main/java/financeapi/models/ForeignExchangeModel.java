package financeapi.models;

public interface ForeignExchangeModel {
    String getContractReference();
    String getExchangeRate();
    String getOriginalAmount();
    String getOriginalCurrency();
}
