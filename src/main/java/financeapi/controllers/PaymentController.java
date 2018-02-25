package financeapi.controllers;

import financeapi.enums.AccountTypes;
import financeapi.enums.DataEntryTypes;
import financeapi.models.*;
import financeapi.repositories.DataEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class PaymentController {

    private DataEntryRepository repository;

    @Inject
    public void setRepository(DataEntryRepository repository) {
        this.repository = repository;
    }

    // This endpoint is just for testing, as no other payment types exist this is the only endpoint
    // for them and used by integration tests for a fast health check during build
    @RequestMapping(path = "others", method = RequestMethod.GET)
    public ResponseEntity<PaymentsModel_Impl> getAllOthers(HttpServletRequest request) {
        return new ResponseEntity<>(new PaymentsModel_Impl(repository.findAll(), new LinksModel_Impl(request
                .getRequestURL()
                .toString())), HttpStatus.OK);
    }

//    @RequestMapping(path = "payments", method = RequestMethod.GET)
//    public ResponseEntity<PaymentsModel_Impl> getAllPayments(HttpServletRequest request) {
//        return new ResponseEntity<>(new PaymentsModel_Impl(repository.findAll(), new LinksModel_Impl(request
//                .getRequestURL()
//                .toString())), HttpStatus.OK);
//    }

    @RequestMapping(path = "payments", method = RequestMethod.GET)
    public ResponseEntity<?> AddNewPayment() {
        BeneficiaryPartyModel_Impl beneficiary = new BeneficiaryPartyModel_Impl(
                "", "", AccountTypes.CURRENT, "", "",
                "", "", "");
        List<ChargeModel_Impl> charges = new ArrayList<>();
//        charges.add(new ChargeModel_Impl("", ""));
        ChargesInformationModel_Impl chargeInfoModel = new ChargesInformationModel_Impl("",
                charges, "", "");
        DebtorPartyModel_Impl debtor = new DebtorPartyModel_Impl("", "", "", "", "", "", "");
        ForeignExchangeModel_Impl fx = new ForeignExchangeModel_Impl("", "", "", "");
        SponsorPartyModel_Impl sponsor = new SponsorPartyModel_Impl("", "", "");
        PaymentAttributesModel_Impl paymentAttributes = new PaymentAttributesModel_Impl("1", beneficiary, chargeInfoModel,
                "", debtor, "", fx, "", "",
                "", "", "", "", "",
                "", "", sponsor
        );
        repository.save(new DataEntryModel_Impl(DataEntryTypes.PAYMENT, "2", 0, "foo", paymentAttributes));
        return new ResponseEntity<>(new PaymentsModel_Impl(repository.findAll(), new LinksModel_Impl("hello")),
                HttpStatus.OK);
//        return new ResponseEntity<>(repository.save(payment), HttpStatus.CREATED);
    }

}
