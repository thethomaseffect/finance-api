package financeapi.models;

public class PaymentAttributesModel_Impl implements PaymentAttributesModel {

    private String amount;
    private BeneficiaryPartyModel beneficiaryParty;
    private ChargesInformationModel chargesInformation;
    private String currency;
    private DebtorPartyModel debtorParty;
    private String endToEndReference;
    private ForeignExchangeModel foreignExchange;
    private String numericReference;
    private String paymentID;
    private String paymentPurpose;
    private String paymentScheme;
    private String paymentType;
    private String processingDate;
    private String reference;
    private String schemePaymentSubType;
    private String schemePaymentType;
    private SponsorPartyModel sponsorParty;

    public PaymentAttributesModel_Impl(String amount, BeneficiaryPartyModel beneficiaryParty, ChargesInformationModel
            chargesInformation, String currency, DebtorPartyModel debtorParty, String endToEndReference,
                                       ForeignExchangeModel foreignExchange, String numericReference, String
                                               paymentID, String paymentPurpose, String paymentScheme, String
                                               paymentType, String processingDate, String reference, String
                                               schemePaymentSubType, String schemePaymentType, SponsorPartyModel
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
