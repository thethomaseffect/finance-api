package financeapi.models;

import financeapi.enums.AccountTypes;

public interface DebtorPartyModel extends PaymentPartyModel {
    String getAccountName();
    String getAccountNumberCode();
    AccountTypes getAccountType();
    String getAddress();
    String getName();
}
