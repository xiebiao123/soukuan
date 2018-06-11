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
public class UserInfoCondition extends Pager implements Serializable{

    /**
     * id
     */
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
    private java.util.Date createTime;

    /**
     * 修改时间
     */
    private java.util.Date modifyTime;

}
