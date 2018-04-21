package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Information;
import com.soukuan.service.InformationService;
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
@RequestMapping("information")
public class InformationController {
    @Resource
    private InformationService informationService;

    @PostMapping("/add")
    public Object add(Information information) {
        informationService.save(information);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = informationService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Information information) {
        int result =  informationService.update(information);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Information information = informationService.findById(id);
        return  ResponseEntityBuilder.success(information);
    }

    @PostMapping("/list")
    public Object list(Information information,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Information> list = informationService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
