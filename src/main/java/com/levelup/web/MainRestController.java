package com.levelup.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @RequestMapping(value = "/form",  method = RequestMethod.POST)
    public ResponseEntity<String> getFormPost(@RequestBody  FormDTO formDTO) {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
