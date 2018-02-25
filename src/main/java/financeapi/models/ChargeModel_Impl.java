package financeapi.models;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Transactional
public class ChargeModel_Impl implements ChargeModel {

    @NotNull
    private String amount;
    @NotNull
    private String currency;

    public ChargeModel_Impl(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public ChargeModel_Impl() {
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public String getCurrency() {
        return currency;
    }
}
