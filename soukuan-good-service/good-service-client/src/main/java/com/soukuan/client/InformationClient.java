package com.soukuan.client;

import com.soukuan.common.good.condition.InformationCondition;
import com.soukuan.common.good.domain.Information;
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
@FeignClient(name="good-service",path = "information")
public interface InformationClient {

    @PostMapping("/add")
    public ResponseEntity add(Information information);

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id);

    @PostMapping("/update")
    public ResponseEntity update(Information information);

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id);

    @PostMapping("/list")
    public ResponseEntity list(InformationCondition information);
}
