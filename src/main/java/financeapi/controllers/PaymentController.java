package financeapi.controllers;

import financeapi.models.DataEntryModel;
import financeapi.models.LinksModel_Impl;
import financeapi.models.PaymentsModel;
import financeapi.models.PaymentsModel_Impl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/others")
public class PaymentController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    PaymentsModel getOthers(HttpServletRequest request) {
        return new PaymentsModel_Impl(new ArrayList<DataEntryModel>(), new LinksModel_Impl(request.getRequestURL().toString()));
    }

}
