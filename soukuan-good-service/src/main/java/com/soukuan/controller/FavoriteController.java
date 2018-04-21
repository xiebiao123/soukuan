package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Favorite;
import com.soukuan.service.FavoriteService;
import com.soukuan.web.Pager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Title
* Author xiebiao@wshifu.com
* DateTime  2018-04-21.
* Version V1.0.0
*/
@RestController
@RequestMapping("favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @PostMapping("/add")
    public Object add(Favorite favorite) {
        favoriteService.save(favorite);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = favoriteService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Favorite favorite) {
        int result =  favoriteService.update(favorite);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Favorite favorite = favoriteService.findById(id);
        return  ResponseEntityBuilder.success(favorite);
    }

    @PostMapping("/list")
    public Object list(Favorite favorite,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Favorite> list = favoriteService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
