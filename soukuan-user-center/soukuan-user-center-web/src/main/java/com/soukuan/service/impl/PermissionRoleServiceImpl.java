package com.soukuan.service.impl;

import com.soukuan.domains.po.PermissionRole;
import com.soukuan.mapper.PermissionRoleMapper;
import com.soukuan.service.PermissionRoleService;
import com.soukuan.web.templ.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@Service
@Transactional
public class PermissionRoleServiceImpl extends AbstractService<PermissionRole> implements PermissionRoleService {

    @Resource
    private PermissionRoleMapper permissionRoleMapper;

}
