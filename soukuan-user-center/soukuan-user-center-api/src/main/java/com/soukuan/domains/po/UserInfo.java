package com.soukuan.domains.po;

import com.soukuan.web.page.Pager;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;


/**
* Title
* Author xiebiao
* DateTime  2018-06-07.
* Version V1.0.0
*/
@Table(name = "t_user_info")
@Data
public class UserInfo extends Pager implements Serializable{

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
     * 邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 状态 1正常 2冻结 3销户
     */
    private Integer status;

    /**
     * 角色
     */
    private String role;

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
