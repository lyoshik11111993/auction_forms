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

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String getMain() {
        return "static/main_bootstrap.html";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String getForm(@RequestParam(name = "email_field") String email,
                          @RequestParam(value = "password_field") String password,
                          @RequestParam(value = "checkbox_field", required = false, defaultValue = "false") Boolean checkbox) {
        Boolean afhfghfghf = Boolean.valueOf("on");
        return "/static/success.html";
    }

}
