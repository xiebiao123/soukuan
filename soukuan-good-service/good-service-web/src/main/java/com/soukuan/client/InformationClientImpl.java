package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.InformationCondition;
import com.soukuan.common.good.domain.Information;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.InformationService;
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
public class InformationClientImpl implements InformationClient {
    @Resource
    private InformationService informationService;

    @PostMapping("/add")
    public ResponseEntity add(Information information) {
        informationService.save(information);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = informationService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Information information) {
        int result =  informationService.update(information);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Information information = informationService.findById(id);
        return  ResponseEntityBuilder.success(information);
    }

    @PostMapping("/list")
    public ResponseEntity list(InformationCondition information) {
        PageHelper.startPage(information.getPageNum(), information.getPageSize());
        List<Information> list = informationService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
