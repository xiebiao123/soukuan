package com.soukuan.service.impl;

import com.soukuan.common.car.domain.Area;
import com.soukuan.mapper.AreaMapper;
import com.soukuan.service.AreaService;
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
public class AreaServiceImpl extends AbstractService<Area> implements AreaService {
    @Resource
    private AreaMapper areaMapper;

}
