package com.soukuan.service.impl;

import com.soukuan.common.good.domain.Message;
import com.soukuan.mapper.MessageMapper;
import com.soukuan.service.MessageService;
import com.soukuan.web.templ.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Title
* Author xiebiao@wshifu.com
* DateTime  2018-04-21.
* Version V1.0.0
*/
@Service
@Transactional
public class MessageServiceImpl extends AbstractService<Message> implements MessageService {
    @Resource
    private MessageMapper messageMapper;

}
