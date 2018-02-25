package financeapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Embeddable
public class PaymentAttributesModel_Impl implements PaymentAttributesModel {

    @NotNull
    private String amount;
    @Embedded
    @NotNull
    private BeneficiaryPartyModel_Impl beneficiaryParty;
    @Embedded
    @NotNull
    private ChargesInformationModel_Impl chargesInformation;
    @NotNull
    private String currency;
    @Embedded
    @NotNull
    private DebtorPartyModel_Impl debtorParty;
    @NotNull
    private String endToEndReference;
    @Embedded
    @NotNull
    private ForeignExchangeModel_Impl foreignExchange;
    @NotNull
    private String numericReference;
    @NotNull
    private String paymentID;
    @NotNull
    private String paymentPurpose;
    @NotNull
    private String paymentScheme;
    @NotNull
    private String paymentType;
    @NotNull
    private String processingDate;
    @NotNull
    private String reference;
    @NotNull
    private String schemePaymentSubType;
    @NotNull
    private String schemePaymentType;
    @Embedded
    @NotNull
    private SponsorPartyModel_Impl sponsorParty;

    public PaymentAttributesModel_Impl(String amount, BeneficiaryPartyModel_Impl beneficiaryParty,
                                       ChargesInformationModel_Impl
            chargesInformation, String currency, DebtorPartyModel_Impl debtorParty, String endToEndReference,
                                       ForeignExchangeModel_Impl foreignExchange, String numericReference, String
                                               paymentID, String paymentPurpose, String paymentScheme, String
                                               paymentType, String processingDate, String reference, String
                                               schemePaymentSubType, String schemePaymentType, SponsorPartyModel_Impl
                                               sponsorParty) {
        this.amount = amount;
        this.beneficiaryParty = beneficiaryParty;
        this.chargesInformation = chargesInformation;
        this.currency = currency;
        this.debtorParty = debtorParty;
        this.endToEndReference = endToEndReference;
        this.foreignExchange = foreignExchange;
        this.numericReference = numericReference;
        this.paymentID = paymentID;
        this.paymentPurpose = paymentPurpose;
        this.paymentScheme = paymentScheme;
        this.paymentType = paymentType;
        this.processingDate = processingDate;
        this.reference = reference;
        this.schemePaymentSubType = schemePaymentSubType;
        this.schemePaymentType = schemePaymentType;
        this.sponsorParty = sponsorParty;
    }

    public PaymentAttributesModel_Impl() {
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public BeneficiaryPartyModel getBeneficiaryParty() {
        return beneficiaryParty;
    }

    @Override
    public ChargesInformationModel getChargesInformation() {
        return chargesInformation;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public DebtorPartyModel getDebtorParty() {
        return debtorParty;
    }

    @Override
    public String getEndToEndReference() {
        return endToEndReference;
    }

    @Override
    public ForeignExchangeModel getForeignExchange() {
        return foreignExchange;
    }

    @Override
    public String getNumericReference() {
        return numericReference;
    }

    @Override
    public String getPaymentID() {
        return paymentID;
    }

    @Override
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    @Override
    public String getPaymentScheme() {
        return paymentScheme;
    }

    @Override
    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public String getProcessingDate() {
        return processingDate;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public String getSchemePaymentSubType() {
        return schemePaymentSubType;
    }

    @Override
    public String getSchemePaymentType() {
        return schemePaymentType;
    }

    @Override
    public SponsorPartyModel getSponsorParty() {
        return sponsorParty;
    }
}
