package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.WareCondition;
import com.soukuan.common.good.domain.Ware;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.WareService;
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
public class WareClientImpl implements WareClient {

    @Resource
    private WareService wareService;

    @PostMapping("/add")
    public ResponseEntity add(Ware ware) {
        wareService.save(ware);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = wareService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Ware ware) {
        int result =  wareService.update(ware);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Ware ware = wareService.findById(id);
        return  ResponseEntityBuilder.success(ware);
    }

    @PostMapping("/list")
    public ResponseEntity list(WareCondition ware) {
        PageHelper.startPage(ware.getPageNum(), ware.getPageSize());
        List<Ware> list = wareService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
