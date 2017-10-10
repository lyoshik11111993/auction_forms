package com.levelup.web.validator;

import com.levelup.web.dto.BuyerDTO;
import com.levelup.web.dto.SellerDTO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BuyerDTOValidator implements Validator{

    public boolean supports(Class<?> aClass) {
        return BuyerDTO.class.getClass().equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        BuyerDTO buyerForm = (BuyerDTO) o;
        String name = buyerForm.getName();
        if (!name.matches("/^[a-z]+([-_]?[a-z0-9]+){0,2}$/i")) {
            errors.rejectValue("buyer_name", "400",
                    "Name should contain only letters, numbers, dashes, and underscores.");
        }
        if (name.isEmpty()) {
            errors.rejectValue("buyer_name", "400", "Field should not be empty.");
        }
    }
}
