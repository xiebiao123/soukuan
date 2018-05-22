package com.soukuan.client;

import com.soukuan.common.good.condition.AdvertiseCondition;
import com.soukuan.common.good.domain.Advertise;
import com.soukuan.domain.ResponseEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* Title
* Author xiebiao@wshifu.com
* DateTime  2018-04-21.
* Version V1.0.0
*/
@FeignClient(name="soukuan-good-service",path = "advertise")
public interface AdvertiseClient {

    @PostMapping("/test")
    void test();

    @PostMapping("/add")
    ResponseEntity add(Advertise advertise);

    @PostMapping("/delete")
    ResponseEntity delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    ResponseEntity update(Advertise advertise);

    @PostMapping("/detail")
    ResponseEntity detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    ResponseEntity list(AdvertiseCondition advertise);
}
