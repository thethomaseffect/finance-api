package financeapi.models;

import financeapi.enums.AccountTypes;

public interface DebtorPartyModel extends PaymentPartyModel {
    String getAccountName();
    String getAccountNumberCode();
    String getAddress();
    String getName();
}
