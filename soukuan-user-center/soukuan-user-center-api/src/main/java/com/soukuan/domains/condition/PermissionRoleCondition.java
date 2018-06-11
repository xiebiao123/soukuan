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
public class PermissionRoleCondition extends Pager implements Serializable{

    /**
     * id
     */
    private Long id;

    /**
     * 权限id
     */
    private Long permissionId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 创建时间
     */
    private java.util.Date createTiem;

    /**
     * 修改时间
     */
    private java.util.Date modifyTime;

}
