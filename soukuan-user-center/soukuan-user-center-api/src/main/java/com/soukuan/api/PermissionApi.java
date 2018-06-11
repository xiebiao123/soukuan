package com.soukuan.api;

import com.soukuan.domains.po.Permission;
import com.soukuan.domains.condition.PermissionCondition;
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
@FeignClient(name = "soukuan-user-center",path = "/permission")
public interface PermissionApi {

    @PostMapping("/add")
    void add(Permission permission);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(Permission permission);

    @PostMapping("/detail")
    Permission detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<Permission>> list(PermissionCondition permissionCondition);
}
