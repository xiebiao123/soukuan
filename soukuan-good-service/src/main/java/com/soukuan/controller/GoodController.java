package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Good;
import com.soukuan.service.GoodService;
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
@RequestMapping("good")
public class GoodController {
    @Resource
    private GoodService goodService;

    @PostMapping("/add")
    public Object add(Good good) {
        goodService.save(good);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = goodService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Good good) {
        int result =  goodService.update(good);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Good good = goodService.findById(id);
        return  ResponseEntityBuilder.success(good);
    }

    @PostMapping("/list")
    public Object list(Good good,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Good> list = goodService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
