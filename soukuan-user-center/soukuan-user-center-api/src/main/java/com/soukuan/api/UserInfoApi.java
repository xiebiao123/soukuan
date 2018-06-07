package com.soukuan.api;

import com.soukuan.domains.po.UserInfo;
import com.soukuan.web.page.SimplePageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* Title
* Author xiebiao
* DateTime  2018-06-07.
* Version V1.0.0
*/
@FeignClient(name = "soukuan-user-center",path = "/userInfo")
public interface UserInfoApi {

    @PostMapping("/add")
    void add(UserInfo userInfo);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(UserInfo userInfo);

    @PostMapping("/detail")
    UserInfo detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<UserInfo>> list(UserInfo userInfo);
}
