package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.GoodCondition;
import com.soukuan.common.good.domain.Good;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.GoodService;
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
public class GoodClientImpl implements GoodClient {

    @Resource
    private GoodService goodService;

    @PostMapping("/add")
    public ResponseEntity add(Good good) {
        goodService.save(good);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = goodService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Good good) {
        int result =  goodService.update(good);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Good good = goodService.findById(id);
        return  ResponseEntityBuilder.success(good);
    }

    @PostMapping("/list")
    public ResponseEntity list(GoodCondition good) {
        PageHelper.startPage(good.getPageNum(), good.getPageSize());
        List<Good> list = goodService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
