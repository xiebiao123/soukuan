package com.soukuan.controller;

import com.soukuan.api.UserInfoApi;
import com.soukuan.domains.po.UserInfo;
import com.soukuan.domains.condition.UserInfoCondition;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@RestController
@RequestMapping("userInfo")
public class UserInfoController implements UserInfoApi {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/add")
    public void add(@RequestBody UserInfo userInfo) {
        userInfoService.save(userInfo);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  userInfoService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody UserInfo userInfo) {
        return userInfoService.update(userInfo);
    }

    @PostMapping("/detail")
    public UserInfo detail(@RequestParam Long id) {
        return  userInfoService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<UserInfo>> list(@RequestBody UserInfoCondition userInfoCondition) {
        PageHelper.startPage(userInfoCondition.getPageNum(), userInfoCondition.getPageSize());
        List<UserInfo> result = userInfoService.findAll();
        return new SimplePageInfo(result);
    }
}
