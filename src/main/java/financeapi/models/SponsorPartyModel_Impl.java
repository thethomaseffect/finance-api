package financeapi.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class SponsorPartyModel_Impl implements SponsorPartyModel {

    @NotNull
    @Column(name = "sponsor_account_number")
    private String accountNumber;
    @NotNull
    @Column(name = "sponsor_bank_id")
    private String bankID;
    @NotNull
    @Column(name = "sponsor_bank_id_code")
    private String bankIDCode;

    public SponsorPartyModel_Impl(String accountNumber, String bankID, String bankIDCode) {
        this.accountNumber = accountNumber;
        this.bankID = bankID;
        this.bankIDCode = bankIDCode;
    }

    public SponsorPartyModel_Impl() {
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
