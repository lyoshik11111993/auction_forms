package com.levelup.web.validator;

import com.levelup.web.dto.BidDTO;
import com.levelup.web.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BidDTOValidator implements Validator{

    public boolean supports(Class<?> aClass) {
        return ProductDTO.class.getClass().equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        BidDTO bidForm = (BidDTO) o;
        int size = bidForm.getSize();
        int buyerId = bidForm.getBuyerId();
        int productId = bidForm.getProductId();
        if (!String.valueOf(size).matches("[0-9]")) {
            errors.rejectValue("size", "400","Size should contain only numbers.");
        }
        if (!String.valueOf(size).isEmpty()) {
            errors.rejectValue("size", "400", "Field should not be empty.");
        }
        if (!String.valueOf(buyerId).matches("[0-9]")) {
            errors.rejectValue("buyer_id", "400", "Identificator should contain only numbers.");
        }
        if (!String.valueOf(buyerId).isEmpty()) {
            errors.rejectValue("buyer_id", "400", "Field should not be empty.");
        }
        if (!String.valueOf(productId).matches("[0-9]")) {
            errors.rejectValue("product_id", "400", "Identificator should contain only numbers.");
        }
        if (!String.valueOf(productId).isEmpty()) {
            errors.rejectValue("product_id", "400", "Field should not be empty.");
        }
    }
}
