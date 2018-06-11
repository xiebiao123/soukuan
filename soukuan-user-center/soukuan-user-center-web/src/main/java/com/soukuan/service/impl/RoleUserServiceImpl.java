package com.soukuan.service.impl;

import com.soukuan.domains.po.RoleUser;
import com.soukuan.mapper.RoleUserMapper;
import com.soukuan.service.RoleUserService;
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
public class RoleUserServiceImpl extends AbstractService<RoleUser> implements RoleUserService {

    @Resource
    private RoleUserMapper roleUserMapper;

}
