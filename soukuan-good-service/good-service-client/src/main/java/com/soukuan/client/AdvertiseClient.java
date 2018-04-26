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
@FeignClient(name="good-service",path = "advertise")
public interface AdvertiseClient {

    @PostMapping("/add")
    public ResponseEntity add(Advertise advertise);

    @PostMapping("/delete")
    ResponseEntity delete(@RequestParam Long id);

    @PostMapping("/update")
    ResponseEntity update(Advertise advertise);

    @PostMapping("/detail")
    ResponseEntity detail(@RequestParam Long id);

    @PostMapping("/list")
    ResponseEntity list(AdvertiseCondition advertise);
}
