package financeapi.models;

import financeapi.enums.AccountTypes;

public interface BeneficiaryPartyModel extends PaymentPartyModel {
    String getAccountName();
    String getAccountNumberCode();
    AccountTypes getAccountType();
    String getAddress();
    String getName();
}
