package com.soukuan.domain.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class Favorite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "good_id")
    private String goodId;

    @Column(name = "good_name")
    private String goodName;

    /**
     * 创建人id
     */
    @Column(name = "creator_id")
    private String creatorId;

    /**
     * 创建人姓名
     */
    @Column(name = "creator_name")
    private String creatorName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

}