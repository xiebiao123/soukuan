package com.soukuan.common.good.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class Area implements Serializable {
    /**
     * 地区id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 父亲id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 地区编码
     */
    private String code;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 层级 1:一级 2:二级  3:三级
     */
    private Integer level;

    /**
     * 序号
     */
    private Integer sort;

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

}