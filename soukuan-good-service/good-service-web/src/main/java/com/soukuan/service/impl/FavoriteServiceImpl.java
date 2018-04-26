package com.soukuan.service.impl;

import com.soukuan.common.good.domain.Favorite;
import com.soukuan.mapper.FavoriteMapper;
import com.soukuan.service.FavoriteService;
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
public class FavoriteServiceImpl extends AbstractService<Favorite> implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

}
