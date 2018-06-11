package com.soukuan.controller;

import com.soukuan.api.PermissionApi;
import com.soukuan.domains.po.Permission;
import com.soukuan.domains.condition.PermissionCondition;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.PermissionService;
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
@RequestMapping("permission")
public class PermissionController implements PermissionApi {

    @Resource
    private PermissionService permissionService;

    @PostMapping("/add")
    public void add(@RequestBody Permission permission) {
        permissionService.save(permission);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  permissionService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody Permission permission) {
        return permissionService.update(permission);
    }

    @PostMapping("/detail")
    public Permission detail(@RequestParam Long id) {
        return  permissionService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<Permission>> list(@RequestBody PermissionCondition permissionCondition) {
        PageHelper.startPage(permissionCondition.getPageNum(), permissionCondition.getPageSize());
        List<Permission> result = permissionService.findAll();
        return new SimplePageInfo(result);
    }
}
