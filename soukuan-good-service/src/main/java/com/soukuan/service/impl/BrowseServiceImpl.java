package com.soukuan.service.impl;

import com.soukuan.domain.po.Browse;
import com.soukuan.mapper.BrowseMapper;
import com.soukuan.service.BrowseService;
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
public class BrowseServiceImpl extends AbstractService<Browse> implements BrowseService {
    @Resource
    private BrowseMapper browseMapper;

}
