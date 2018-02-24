package financeapi.models;

import financeapi.enums.AccountTypes;

public class BeneficiaryPartyModel_Impl implements BeneficiaryPartyModel {

    private String accountName;

    public BeneficiaryPartyModel_Impl(String accountName, String accountNumberCode, AccountTypes accountType, String
            address, String name, String accountNumber, String bankID, String bankIDCode) {
        this.accountName = accountName;
        this.accountNumberCode = accountNumberCode;
        this.accountType = accountType;
        this.address = address;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankID = bankID;
        this.bankIDCode = bankIDCode;
    }

    private String accountNumberCode;
    private AccountTypes accountType;
    private String address;
    private String name;
    private String accountNumber;
    private String bankID;
    private String bankIDCode;

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public String getAccountNumberCode() {
        return accountNumberCode;
    }

    @Override
    public AccountTypes getAccountType() {
        return accountType;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getBankID() {
        return bankID;
    }

    @Override
    public String getBankIDCode() {
        return bankIDCode;
    }
}
