package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Browse;
import com.soukuan.service.BrowseService;
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
@RequestMapping("browse")
public class BrowseController {
    @Resource
    private BrowseService browseService;

    @PostMapping("/add")
    public Object add(Browse browse) {
        browseService.save(browse);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = browseService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Browse browse) {
        int result =  browseService.update(browse);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Browse browse = browseService.findById(id);
        return  ResponseEntityBuilder.success(browse);
    }

    @PostMapping("/list")
    public Object list(Browse browse,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Browse> list = browseService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
