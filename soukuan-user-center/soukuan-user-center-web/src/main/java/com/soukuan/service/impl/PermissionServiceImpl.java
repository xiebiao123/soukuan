package com.soukuan.service.impl;

import com.soukuan.domains.po.Permission;
import com.soukuan.mapper.PermissionMapper;
import com.soukuan.service.PermissionService;
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
public class PermissionServiceImpl extends AbstractService<Permission> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;

}
