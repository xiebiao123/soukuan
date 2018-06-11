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
@Table(name = "sys_permission_role")
@Data
public class PermissionRole implements Serializable{

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限id
     */
    @Column(name = "permission_id")
    private Long permissionId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 创建时间
     */
    @Column(name = "create_tiem")
    private java.util.Date createTiem;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private java.util.Date modifyTime;

}
