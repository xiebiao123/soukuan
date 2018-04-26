package com.soukuan.common.good.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Good implements Serializable {
    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商品编码
     */
    private String code;

    /**
     * 品名
     */
    private String name;

    /**
     * 商品类别编码
     */
    @Column(name = "good_type_id")
    private String goodTypeId;

    /**
     * 商品类别名称
     */
    @Column(name = "good_type_name")
    private String goodTypeName;

    @Column(name = "good_kind_id")
    private String goodKindId;

    /**
     * 商品类别名称
     */
    @Column(name = "good_kind_name")
    private String goodKindName;

    @Column(name = "brand_id")
    private String brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "supplier_id")
    private String supplierId;

    @Column(name = "supplier_name")
    private String supplierName;

    private String unit;

    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    private BigDecimal price;

    @Column(name = "price_market")
    private BigDecimal priceMarket;

    /**
     * 团购价
     */
    @Column(name = "price_group_buy")
    private BigDecimal priceGroupBuy;

    /**
     * 积分
     */
    private Integer credits;

    @Column(name = "pic_id")
    private String picId;

    /**
     * 商品图片
     */
    private String pic;

    private String tag;

    /**
     * 上架时间
     */
    @Column(name = "begin_sale_time")
    private Date beginSaleTime;

    /**
     * 下架时间
     */
    @Column(name = "end_sale_time")
    private Date endSaleTime;

    @Column(name = "order_multiple")
    private Integer orderMultiple;

    @Column(name = "total_sales")
    private Integer totalSales;

    @Column(name = "daily_net_sales")
    private Integer dailyNetSales;

    @Column(name = "purchase_num")
    private Integer purchaseNum;

    @Column(name = "total_cost_inventory")
    private BigDecimal totalCostInventory;

    @Column(name = "average_cost_inventory")
    private BigDecimal averageCostInventory;

    @Column(name = "inventory_min")
    private Integer inventoryMin;

    @Column(name = "inventory_max")
    private Integer inventoryMax;

    /**
     * 0或空:不显示 1:显示 
     */
    @Column(name = "index_show")
    private String indexShow;

    private String barcode;

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
     * 数据状态 c:草稿 s;审核 d:下架
     */
    private String state;

    /**
     * 0普通 1团购
     */
    @Column(name = "is_inventory")
    private String isInventory;

    /**
     * 期初初始数量
     */
    @Column(name = "initialNum")
    private Long initialnum;

    /**
     * 税率
     */
    @Column(name = "tax_rate")
    private BigDecimal taxRate;

    /**
     * 含税单价
     */
    @Column(name = "tax_price")
    private BigDecimal taxPrice;

    /**
     * 商品属性
     */
    private String property;

    private String remark;

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "click_number")
    private BigDecimal clickNumber;

    @Column(name = "delivery_id")
    private String deliveryId;

    @Column(name = "payment_id")
    private String paymentId;

    /**
     * 商品的评论数
     */
    @Column(name = "comment_count")
    private Integer commentCount;

    private Integer sort;

    @Column(name = "group_number")
    private Integer groupNumber;

    /**
     * 开始团购时间/开始抢购时间/开始秒杀时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     *  结束团购时间/结束抢购时间/结束秒杀时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 下期预告
     */
    @Column(name = "is_next")
    private String isNext;

    /**
     * 返点比率
     */
    @Column(name = "return_rate")
    private BigDecimal returnRate;

    /**
     * 返点价格
     */
    @Column(name = "return_price")
    private BigDecimal returnPrice;

    /**
     * 活动商品上架多少件
     */
    @Column(name = "activit_number")
    private String activitNumber;

    /**
     * 抢购/秒杀数量
     */
    @Column(name = "total_num")
    private String totalNum;

}