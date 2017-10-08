package com.levelup.web;

import lombok.Data;

public class FormDTO {

    private String email;

    FormDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
