package com.levelup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class MainController {
    private static final String successPage = "/static/success.html";

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String getMain() {
        return "static/main_bootstrap.html";
    }

    @RequestMapping(value = "/sellerform", method = RequestMethod.GET)
    public String getSellerForm(@RequestParam(name = "seller_name") String name) {
        return successPage;
    }

    @RequestMapping(value = "/buyerform", method = RequestMethod.GET)
    public String getBuyerForm(@RequestParam(name = "buyer_name") String name) {
        return successPage;
    }

    @RequestMapping(value = "/productform", method = RequestMethod.GET)
    public String getProductForm(@RequestParam(name = "product_name") String name,
                                 @RequestParam(name = "seller_id") int sellerId) {
        return successPage;
    }

    @RequestMapping(value = "/bidform", method = RequestMethod.GET)
    public String getSellerForm(@RequestParam(name = "size") int size,
                                @RequestParam(name = "buyer_id") int buyerId,
                                @RequestParam(name = "product_id") int productId) {
        return successPage;
    }

}
