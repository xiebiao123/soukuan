package com.soukuan.api;

import com.soukuan.domains.po.PermissionRole;
import com.soukuan.domains.condition.PermissionRoleCondition;
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
@FeignClient(name = "soukuan-user-center",path = "/permissionRole")
public interface PermissionRoleApi {

    @PostMapping("/add")
    void add(PermissionRole permissionRole);

    @PostMapping("/delete")
    int delete(@RequestParam("id") Long id);

    @PostMapping("/update")
    int update(PermissionRole permissionRole);

    @PostMapping("/detail")
    PermissionRole detail(@RequestParam("id") Long id);

    @PostMapping("/list")
    SimplePageInfo<List<PermissionRole>> list(PermissionRoleCondition permissionRoleCondition);
}
