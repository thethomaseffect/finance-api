package financeapi.models;

import financeapi.enums.AccountTypes;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Embeddable
public class BeneficiaryPartyModel_Impl implements BeneficiaryPartyModel {

    @NotNull
    @Column(name = "beneficiary_account_name")
    private String accountName;
    @NotNull
    @Column(name = "beneficiary_account_number_code")
    private String accountNumberCode;
    @Enumerated
    @Column(columnDefinition = "smallint", name = "beneficiary_account_type")
    @NotNull
    private AccountTypes accountType;
    @NotNull
    @Column(name = "beneficiary_address")
    private String address;
    @NotNull
    @Column(name = "beneficiary_name")
    private String name;
    @NotNull
    @Column(name = "beneficiary_account_number")
    private String accountNumber;
    @NotNull
    @Column(name = "beneficiary_bank_id")
    private String bankID;
    @NotNull
    @Column(name = "beneficiary_bank_id_code")
    private String bankIDCode;

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

    public BeneficiaryPartyModel_Impl() {
    }

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
