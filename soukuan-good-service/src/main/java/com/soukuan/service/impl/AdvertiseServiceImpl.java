package com.soukuan.service.impl;

import com.soukuan.domain.po.Advertise;
import com.soukuan.mapper.AdvertiseMapper;
import com.soukuan.service.AdvertiseService;
import com.soukuan.web.templ.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Title
* Author xiebiao@wshifu.com
* DateTime  2018-04-21.
* Version V1.0.0
*/
@Service
@Transactional
public class AdvertiseServiceImpl extends AbstractService<Advertise> implements AdvertiseService {
    @Resource
    private AdvertiseMapper advertiseMapper;

}
