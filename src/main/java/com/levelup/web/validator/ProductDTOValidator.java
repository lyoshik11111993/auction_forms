package com.levelup.web.validator;

import com.levelup.web.dto.ProductDTO;
import com.levelup.web.dto.SellerDTO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductDTOValidator implements Validator{

    public boolean supports(Class<?> aClass) {
        return ProductDTO.class.getClass().equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ProductDTO productForm = (ProductDTO) o;
        String name = productForm.getName();
        int sellerId = productForm.getSellerId();
        if (!name.matches("/^[a-z]+([-_]?[a-z0-9]+){0,2}$/i")) {
            errors.rejectValue("product_name", "400",
                    "Name should contain only letters, numbers, dashes, and underscores.");
        }
        if (name.isEmpty()) {
            errors.rejectValue("product_name", "400", "Field should not be empty.");
        }
        if (!String.valueOf(sellerId).matches("[0-9]")) {
            errors.rejectValue("seller_id", "400", "Identificator should contain only numbers.");
        }
        if (String.valueOf(sellerId).isEmpty()) {
            errors.rejectValue("seller_id", "400", "Field should not be empty.");
        }
    }
}
