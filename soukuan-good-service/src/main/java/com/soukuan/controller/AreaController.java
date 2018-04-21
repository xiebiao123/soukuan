package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Area;
import com.soukuan.service.AreaService;
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
@RequestMapping("area")
public class AreaController {
    @Resource
    private AreaService areaService;

    @PostMapping("/add")
    public Object add(Area area) {
        areaService.save(area);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = areaService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Area area) {
        int result =  areaService.update(area);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Area area = areaService.findById(id);
        return  ResponseEntityBuilder.success(area);
    }

    @PostMapping("/list")
    public Object list(Area area,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Area> list = areaService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
