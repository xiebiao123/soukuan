package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Advertise;
import com.soukuan.service.AdvertiseService;
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
@RequestMapping("advertise")
public class AdvertiseController {

    @Resource
    private AdvertiseService advertiseService;

    @PostMapping("/add")
    public Object add(Advertise advertise) {
        advertiseService.save(advertise);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = advertiseService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Advertise advertise) {
        int result =  advertiseService.update(advertise);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Advertise advertise = advertiseService.findById(id);
        return  ResponseEntityBuilder.success(advertise);
    }

    @PostMapping("/list")
    public Object list(Advertise advertise,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Advertise> list = advertiseService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
