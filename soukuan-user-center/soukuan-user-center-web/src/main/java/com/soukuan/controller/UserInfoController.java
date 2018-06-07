package com.soukuan.controller;

import com.soukuan.api.UserInfoApi;
import com.soukuan.domains.po.UserInfo;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Title
* Author xiebiao
* DateTime  2018-06-07.
* Version V1.0.0
*/
@RestController
@RequestMapping("userInfo")
public class UserInfoController implements UserInfoApi {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/add")
    public void add(UserInfo userInfo) {
        userInfoService.save(userInfo);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        int result = userInfoService.deleteById(id);
        return  result;
    }

    @PostMapping("/update")
    public int update(UserInfo userInfo) {
        int result =  userInfoService.update(userInfo);
        return result;
    }

    @PostMapping("/detail")
    public UserInfo detail(@RequestParam Long id) {
        UserInfo userInfo = userInfoService.findById(id);
        return  userInfo;
    }

    @PostMapping("/list")
    public SimplePageInfo<List<UserInfo>> list(UserInfo userInfo) {
        PageHelper.startPage(userInfo.getPageNum(), userInfo.getPageSize());
        List<UserInfo> result = userInfoService.findAll();
        return new SimplePageInfo(result);
    }
}
