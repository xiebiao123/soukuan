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
@Table(name = "sys_user")
@Data
public class User implements Serializable{

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

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
