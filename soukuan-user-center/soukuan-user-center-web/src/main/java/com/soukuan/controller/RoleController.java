package com.soukuan.controller;

import com.soukuan.api.RoleApi;
import com.soukuan.domains.po.Role;
import com.soukuan.domains.condition.RoleCondition;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.RoleService;
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
@RequestMapping("role")
public class RoleController implements RoleApi {

    @Resource
    private RoleService roleService;

    @PostMapping("/add")
    public void add(@RequestBody Role role) {
        roleService.save(role);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  roleService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody Role role) {
        return roleService.update(role);
    }

    @PostMapping("/detail")
    public Role detail(@RequestParam Long id) {
        return  roleService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<Role>> list(@RequestBody RoleCondition roleCondition) {
        PageHelper.startPage(roleCondition.getPageNum(), roleCondition.getPageSize());
        List<Role> result = roleService.findAll();
        return new SimplePageInfo(result);
    }
}
