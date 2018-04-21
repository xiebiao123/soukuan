package com.soukuan.domain.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 0: 普通会员    1:联盟店会员  2:企业会员
     */
    private String type;

    private String name;

    @Column(name = "card_number")
    private String cardNumber;

    private String code;

    private String sex;

    private String account;

    private String pwd;

    private BigDecimal payables;

    @Column(name = "vip_level_id")
    private String vipLevelId;

    @Column(name = "vip_level_name")
    private String vipLevelName;

    private Long credits;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private String companyAddress;

    private String linkman;

    private String mobile;

    private String telephone;

    private String email;

    @Column(name = "area_ids")
    private String areaIds;

    @Column(name = "area_names")
    private String areaNames;

    private String street;

    @Column(name = "zip_code")
    private String zipCode;

    private String remark;

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

    @Column(name = "warehouse_Id")
    private String warehouseId;

    @Column(name = "warehouse_Name")
    private String warehouseName;

    /**
     * 婚姻状况
     */
    private String maritalstatus;

    /**
     * 受教育程度
     */
    private String schooling;

    /**
     * 月收入
     */
    private String salary;

    /**
     * 是否绑定手机  0未绑定   1已绑定
     */
    @Column(name = "is_pinlessmobile")
    private String isPinlessmobile;

    /**
     * 是否绑定邮箱   0为绑定  1已绑定
     */
    @Column(name = "is_pinlessemail")
    private String isPinlessemail;

    private String pic;

    @Column(name = "pic_id")
    private String picId;

    @Column(name = "id_card")
    private String idCard;

    @Column(name = "card_endtime")
    private Date cardEndtime;

    @Column(name = "card_address")
    private String cardAddress;

    @Column(name = "inner_picId")
    private String innerPicid;

    @Column(name = "inner_pic")
    private String innerPic;

    @Column(name = "inner_name")
    private String innerName;

    @Column(name = "inner_area")
    private String innerArea;

    @Column(name = "inner_introduce")
    private String innerIntroduce;

}