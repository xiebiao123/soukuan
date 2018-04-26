package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.MessageCondition;
import com.soukuan.common.good.domain.Message;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.MessageService;
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
@RequestMapping("message")
public class MessageClientImpl implements MessageClient {
    @Resource
    private MessageService messageService;

    @PostMapping("/add")
    public ResponseEntity add(Message message) {
        messageService.save(message);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = messageService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Message message) {
        int result =  messageService.update(message);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Message message = messageService.findById(id);
        return  ResponseEntityBuilder.success(message);
    }

    @PostMapping("/list")
    public ResponseEntity list(MessageCondition message) {
        PageHelper.startPage(message.getPageNum(), message.getPageSize());
        List<Message> list = messageService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
