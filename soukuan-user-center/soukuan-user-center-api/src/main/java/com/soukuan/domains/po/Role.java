package com.soukuan.domains.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@Table(name = "sys_role")
@Data
public class Role implements Serializable{

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * code
     */
    private String code;

    /**
     * 角色名
     */
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private java.util.Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private java.util.Date modifyTime;

}
