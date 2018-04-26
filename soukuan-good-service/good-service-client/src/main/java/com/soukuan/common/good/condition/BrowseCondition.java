package com.soukuan.common.good.condition;

import com.soukuan.web.page.Pager;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class BrowseCondition extends Pager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "good_id")
    private String goodId;

    @Column(name = "create_time")
    private Date createTime;

    private String state;

    @Column(name = "good_name")
    private String goodName;

    @Column(name = "good_pic")
    private String goodPic;

    @Column(name = "good_price")
    private Long goodPrice;

}