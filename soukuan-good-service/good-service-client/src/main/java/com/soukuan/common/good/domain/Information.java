package com.soukuan.common.good.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class Information implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String code;

    /**
     * 信息类别，公告：0，新闻：1，资讯：2
     */
    private String type;

    private String title;

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

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "area_name")
    private String areaName;

    /**
     * 规则类型：  0团购规则  1抢购规则  2秒杀规则   3优惠卷规则
     */
    @Column(name = "regulation_type")
    private String regulationType;

    private String content;

}