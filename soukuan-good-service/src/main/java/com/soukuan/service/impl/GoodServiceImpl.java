package com.soukuan.service.impl;

import com.soukuan.domain.po.Good;
import com.soukuan.mapper.GoodMapper;
import com.soukuan.service.GoodService;
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
public class GoodServiceImpl extends AbstractService<Good> implements GoodService {
    @Resource
    private GoodMapper goodMapper;

}
