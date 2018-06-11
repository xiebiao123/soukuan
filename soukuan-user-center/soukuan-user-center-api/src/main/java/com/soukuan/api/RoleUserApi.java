package com.soukuan.api;

import com.soukuan.domains.po.RoleUser;
import com.soukuan.domains.condition.RoleUserCondition;
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
@FeignClient(name = "soukuan-user-center",path = "/roleUser")
public interface RoleUserApi {

    @PostMapping("/add")
    void add(RoleUser roleUser);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(RoleUser roleUser);

    @PostMapping("/detail")
    RoleUser detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<RoleUser>> list(RoleUserCondition roleUserCondition);
}
