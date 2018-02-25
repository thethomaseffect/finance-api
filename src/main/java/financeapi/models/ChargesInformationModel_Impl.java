package financeapi.models;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import java.util.List;

@Embeddable
@Transactional
public class ChargesInformationModel_Impl implements ChargesInformationModel {

    @NotNull
    private String bearerCode;
    @NotNull
    @ElementCollection
    @CollectionTable(name = "payment_sender_charges", joinColumns = @JoinColumn(name = "payment_sender_charges_id", nullable = false))
    private List<ChargeModel_Impl> senderCharges;
    @NotNull
    private String receiverChargesAmount;
    @NotNull
    private String receiverChargesCurrency;

    public ChargesInformationModel_Impl(String bearerCode, List<ChargeModel_Impl> senderCharges, String
            receiverChargesAmount, String receiverChargesCurrency) {
        this.bearerCode = bearerCode;
        this.senderCharges = senderCharges;
        this.receiverChargesAmount = receiverChargesAmount;
        this.receiverChargesCurrency = receiverChargesCurrency;
    }

    public ChargesInformationModel_Impl() {
    }

    @Override
    public String getBearerCode() {
        return bearerCode;
    }

    @Override
    public List<ChargeModel_Impl> getSenderCharges() {
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
