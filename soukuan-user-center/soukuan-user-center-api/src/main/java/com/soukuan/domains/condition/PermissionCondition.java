package com.soukuan.domains.condition;

import com.soukuan.web.page.Pager;
import lombok.Data;

import java.io.Serializable;


/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@Data
public class PermissionCondition extends Pager implements Serializable{

    /**
     * id
     */
    private Long id;

    /**
     * code
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 创建时间
     */
    private java.util.Date createTime;

    /**
     * 修改时间
     */
    private java.util.Date modifyTime;

}
