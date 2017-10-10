package com.levelup.web;


import com.levelup.web.dto.BidDTO;
import com.levelup.web.dto.BuyerDTO;
import com.levelup.web.dto.ProductDTO;
import com.levelup.web.dto.SellerDTO;
import com.levelup.web.validator.BidDTOValidator;
import com.levelup.web.validator.BuyerDTOValidator;
import com.levelup.web.validator.ProductDTOValidator;
import com.levelup.web.validator.SellerDTOValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {
    private SellerDTOValidator sellerDTOValidator;
    private BuyerDTOValidator buyerDTOValidator;
    private ProductDTOValidator productDTOValidator;
    private BidDTOValidator bidDTOValidator;

    @Autowired
    public MainRestController(SellerDTOValidator sellerDTOValidator, BuyerDTOValidator buyerDTOValidator,
                              ProductDTOValidator productDTOValidator, BidDTOValidator bidDTOValidator) {
        this.sellerDTOValidator = sellerDTOValidator;
        this.buyerDTOValidator = buyerDTOValidator;
        this.productDTOValidator = productDTOValidator;
        this.bidDTOValidator = bidDTOValidator;
    }

    @InitBinder
    private void sellerBinder(WebDataBinder binder) {
        binder.setValidator(sellerDTOValidator);
    }

    @InitBinder
    private void buyerBinder(WebDataBinder binder) {
        binder.setValidator(buyerDTOValidator);
    }

    @InitBinder
    private void productBinder(WebDataBinder binder) {
        binder.setValidator(productDTOValidator);
    }

    @InitBinder
    private void bidBinder(WebDataBinder binder) {
        binder.setValidator(bidDTOValidator);
    }

    @RequestMapping(value = "/sellerform",  method = RequestMethod.POST)
    public ResponseEntity<String> getSellerForm(@RequestBody @Validated SellerDTO sellerDTO,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/buyerform",  method = RequestMethod.POST)
    public ResponseEntity<String> getBuyerForm(@RequestBody @Validated BuyerDTO buyerDTO,
                                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/productform",  method = RequestMethod.POST)
    public ResponseEntity<String> getProductForm(@RequestBody @Validated ProductDTO productDTO,
                                                 BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/bidform",  method = RequestMethod.POST)
    public ResponseEntity<String> getBidForm(@RequestBody @Validated BidDTO bidDTO,
                                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
