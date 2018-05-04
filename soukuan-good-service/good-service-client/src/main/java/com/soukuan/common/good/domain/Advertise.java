package com.soukuan.common.good.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class Advertise implements Serializable {
    /**
     * 广告id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String subject;

    @Column(name = "pic_id")
    private String picId;

    private String pic;

    private Integer level;

    @Column(name = "place_id")
    private String placeId;

    private String place;

    private String type;

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

    /**
     * 修改人id
     */
    @Column(name = "modifier_id")
    private String modifierId;

    /**
     * 修改人姓名
     */
    @Column(name = "modifier_name")
    private String modifierName;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 数据状态 c:草稿 s;审核 d:删除
     */
    private String state;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 是否关联商品类型【父类频道页面广告位】
     */
    @Column(name = "is_good_type_id")
    private String isGoodTypeId;

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "area_name")
    private String areaName;

    private String content;

}