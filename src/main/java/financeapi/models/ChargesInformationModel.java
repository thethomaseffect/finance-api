package financeapi.models;

import java.util.List;

public interface ChargesInformationModel {
    String getBearerCode();
    List<ChargeModel> getSenderCharges();
    String getReceiverChargesAmount();
    String getReceiverChargesCurrency();
}
