package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Message;
import com.soukuan.service.MessageService;
import com.soukuan.web.Pager;
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
public class MessageController {
    @Resource
    private MessageService messageService;

    @PostMapping("/add")
    public Object add(Message message) {
        messageService.save(message);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = messageService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Message message) {
        int result =  messageService.update(message);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Message message = messageService.findById(id);
        return  ResponseEntityBuilder.success(message);
    }

    @PostMapping("/list")
    public Object list(Message message,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Message> list = messageService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
