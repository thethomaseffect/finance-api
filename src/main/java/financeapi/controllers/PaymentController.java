package financeapi.controllers;

import financeapi.models.PaymentsModel;
import financeapi.models.PaymentsModel_Impl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/others")
public class PaymentController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    PaymentsModel getOthers() {
        return new PaymentsModel_Impl();
    }

}
