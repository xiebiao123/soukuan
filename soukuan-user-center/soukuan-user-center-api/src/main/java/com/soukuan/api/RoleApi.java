package com.soukuan.api;

import com.soukuan.domains.po.Role;
import com.soukuan.domains.condition.RoleCondition;
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
@FeignClient(name = "soukuan-user-center",path = "/role")
public interface RoleApi {

    @PostMapping("/add")
    void add(Role role);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(Role role);

    @PostMapping("/detail")
    Role detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<Role>> list(RoleCondition roleCondition);
}
