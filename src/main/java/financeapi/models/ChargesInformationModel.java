package financeapi.models;

import java.util.List;

public interface ChargesInformationModel {
    String getBearerCode();
    List<ChargeModel_Impl> getSenderCharges();
    String getReceiverChargesAmount();
    String getReceiverChargesCurrency();
}
