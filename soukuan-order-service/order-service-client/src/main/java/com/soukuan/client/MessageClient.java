package com.soukuan.client;

import com.soukuan.common.order.condition.MessageCondition;
import com.soukuan.common.order.domain.Message;
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
@FeignClient(name="soukuan-order-service",path = "message")
public interface MessageClient {

    @PostMapping("/add")
    public ResponseEntity add(Message message);

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id);

    @PostMapping("/update")
    public ResponseEntity update(Message message);

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id);

    @PostMapping("/list")
    public ResponseEntity list(MessageCondition message);
}
