package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Ware;
import com.soukuan.service.WareService;
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
@RequestMapping("ware")
public class WareController {
    @Resource
    private WareService wareService;

    @PostMapping("/add")
    public Object add(Ware ware) {
        wareService.save(ware);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = wareService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Ware ware) {
        int result =  wareService.update(ware);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Ware ware = wareService.findById(id);
        return  ResponseEntityBuilder.success(ware);
    }

    @PostMapping("/list")
    public Object list(Ware ware,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Ware> list = wareService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
