package com.soukuan.service.impl;

import com.soukuan.domain.po.Information;
import com.soukuan.mapper.InformationMapper;
import com.soukuan.service.InformationService;
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
public class InformationServiceImpl extends AbstractService<Information> implements InformationService {
    @Resource
    private InformationMapper informationMapper;

}
