package com.soukuan.service.impl;

import com.soukuan.domains.po.UserInfo;
import com.soukuan.mapper.UserInfoMapper;
import com.soukuan.service.UserInfoService;
import com.soukuan.web.templ.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Title
* Author xiebiao
* DateTime  2018-06-07.
* Version V1.0.0
*/
@Service
@Transactional
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

}
