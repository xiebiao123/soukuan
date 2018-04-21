package com.soukuan.service.impl;

import com.soukuan.domain.po.Ware;
import com.soukuan.mapper.WareMapper;
import com.soukuan.service.WareService;
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
public class WareServiceImpl extends AbstractService<Ware> implements WareService {
    @Resource
    private WareMapper wareMapper;

}
