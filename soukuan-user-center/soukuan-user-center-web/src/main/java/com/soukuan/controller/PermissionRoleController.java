package com.soukuan.controller;

import com.soukuan.api.PermissionRoleApi;
import com.soukuan.domains.po.PermissionRole;
import com.soukuan.domains.condition.PermissionRoleCondition;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.PermissionRoleService;
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
@RequestMapping("permissionRole")
public class PermissionRoleController implements PermissionRoleApi {

    @Resource
    private PermissionRoleService permissionRoleService;

    @PostMapping("/add")
    public void add(@RequestBody PermissionRole permissionRole) {
        permissionRoleService.save(permissionRole);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  permissionRoleService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody PermissionRole permissionRole) {
        return permissionRoleService.update(permissionRole);
    }

    @PostMapping("/detail")
    public PermissionRole detail(@RequestParam Long id) {
        return  permissionRoleService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<PermissionRole>> list(@RequestBody PermissionRoleCondition permissionRoleCondition) {
        PageHelper.startPage(permissionRoleCondition.getPageNum(), permissionRoleCondition.getPageSize());
        List<PermissionRole> result = permissionRoleService.findAll();
        return new SimplePageInfo(result);
    }
}
