package financeapi.models;

public interface PaymentAttributesModel extends DataEntryAttributesModel {
    String getAmount();
    BeneficiaryPartyModel getBeneficiaryParty();
    ChargesInformationModel getChargesInformation();
    String getCurrency();
    DebtorPartyModel getDebtorParty();
    String getEndToEndReference();
    ForeignExchangeModel getForeignExchange();
    String getNumericReference();
    String getPaymentID();
    String getPaymentPurpose();
    String getPaymentScheme();
    String getPaymentType();
    String getProcessingDate();
    String getReference();
    String getSchemePaymentSubType();
    String getSchemePaymentType();
    SponsorPartyModel getSponserParty();
}
