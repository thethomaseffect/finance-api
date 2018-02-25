package financeapi.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class DebtorPartyModel_Impl implements DebtorPartyModel {

    @NotNull
    @Column(name = "debtor_account_name")
    private String accountName;
    @NotNull
    @Column(name = "debtor_account_number_code")
    private String accountNumberCode;
    @NotNull
    @Column(name = "debtor_address")
    private String address;
    @NotNull
    @Column(name = "debtor_name")
    private String name;
    @NotNull
    @Column(name = "debtor_account_number")
    private String accountNumber;
    @NotNull
    @Column(name = "debtor_bank_id")
    private String bankID;
    @NotNull
    @Column(name = "debtor_bank_id_code")
    private String bankIDCode;

    public DebtorPartyModel_Impl(String accountName, String accountNumberCode, String
            address, String name, String accountNumber, String bankID, String bankIDCode) {
        this.accountName = accountName;
        this.accountNumberCode = accountNumberCode;
        this.address = address;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankID = bankID;
        this.bankIDCode = bankIDCode;
    }

    public DebtorPartyModel_Impl() {
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
