package com.soukuan.api;

import com.soukuan.domains.po.User;
import com.soukuan.domains.condition.UserCondition;
import com.soukuan.web.page.SimplePageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@FeignClient(name = "soukuan-user-center",path = "/user")
public interface UserApi {

    @PostMapping("/add")
    void add(User user);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(User user);

    @PostMapping("/detail")
    User detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<User>> list(UserCondition userCondition);
}
