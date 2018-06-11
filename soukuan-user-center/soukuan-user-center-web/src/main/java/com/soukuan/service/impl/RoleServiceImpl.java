package com.soukuan.service.impl;

import com.soukuan.domains.po.Role;
import com.soukuan.mapper.RoleMapper;
import com.soukuan.service.RoleService;
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
public class RoleServiceImpl extends AbstractService<Role> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

}
