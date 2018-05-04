package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.AdvertiseCondition;
import com.soukuan.common.good.domain.Advertise;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.AdvertiseService;
import com.soukuan.util.BeanUtils;
import org.springframework.web.bind.annotation.*;

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
public class AdvertiseClientImpl implements  AdvertiseClient {

    @Resource
    private AdvertiseService advertiseService;

    @PostMapping("/add")
    public ResponseEntity add(Advertise advertise) {
        advertiseService.save(advertise);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = advertiseService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Advertise advertise) {
        int result =  advertiseService.update(advertise);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Advertise advertise = advertiseService.findById(id);
        return  ResponseEntityBuilder.success(advertise);
    }

    @GetMapping("/list")
    public ResponseEntity list(AdvertiseCondition advertise) {
        PageHelper.startPage(advertise.getPageNum(), advertise.getPageSize());
        List<Advertise> list = advertiseService.find(BeanUtils.copyObject(advertise,Advertise.class));
        return ResponseEntityBuilder.successPage(list);
    }
}
