package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.car.condition.AreaCondition;
import com.soukuan.common.car.domain.Area;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.AreaService;
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
public class AreaClientImpl implements AreaClient {
    @Resource
    private AreaService areaService;

    @PostMapping("/add")
    public ResponseEntity add(Area area) {
        areaService.save(area);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = areaService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Area area) {
        int result =  areaService.update(area);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Area area = areaService.findById(id);
        return  ResponseEntityBuilder.success(area);
    }

    @PostMapping("/list")
    public ResponseEntity list(AreaCondition area) {
        PageHelper.startPage(area.getPageNum(), area.getPageSize());
        List<Area> list = areaService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
