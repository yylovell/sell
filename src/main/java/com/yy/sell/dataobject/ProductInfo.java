package com.yy.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String ProductDescription;


    private String productIcon;

    /*状态 0-正常  1-下架*/
    private Integer productStatus;

    private Integer categoryType;



}
