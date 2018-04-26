package com.soukuan.common.good.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Ware implements Serializable {
    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "good_id")
    private String goodId;

    @Column(name = "groupgood_id")
    private String groupgoodId;

    private String code;

    private Integer stock;

    @Column(name = "price_discount")
    private BigDecimal priceDiscount;

    /**
     * 序号
     */
    private Integer sort;

    private String pic;

    @Column(name = "pic_id")
    private String picId;

    @Column(name = "good_val_id")
    private String goodValId;

    @Column(name = "good_val")
    private String goodVal;

}