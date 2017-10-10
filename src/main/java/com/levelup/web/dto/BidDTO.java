package com.levelup.web.dto;

import lombok.Data;

@Data
public class BidDTO {
    private int id;
    private int size;
    private int buyerId;
    private int productId;
}
