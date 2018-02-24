package financeapi.models;

import java.util.List;

public class ChargesInformationModel_Impl implements ChargesInformationModel {

    private String bearerCode;
    private List<ChargeModel> senderCharges;
    private String receiverChargesAmount;
    private String receiverChargesCurrency;

    public ChargesInformationModel_Impl(String bearerCode, List<ChargeModel> senderCharges, String
            receiverChargesAmount, String receiverChargesCurrency) {
        this.bearerCode = bearerCode;
        this.senderCharges = senderCharges;
        this.receiverChargesAmount = receiverChargesAmount;
        this.receiverChargesCurrency = receiverChargesCurrency;
    }

    @Override
    public String getBearerCode() {
        return bearerCode;
    }

    @Override
    public List<ChargeModel> getSenderCharges() {
        return senderCharges;
    }

    @Override
    public String getReceiverChargesAmount() {
        return receiverChargesAmount;
    }

    @Override
    public String getReceiverChargesCurrency() {
        return receiverChargesCurrency;
    }
}
