package com.soukuan.controller;

import com.soukuan.api.RoleUserApi;
import com.soukuan.domains.po.RoleUser;
import com.soukuan.domains.condition.RoleUserCondition;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.RoleUserService;
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
@RequestMapping("roleUser")
public class RoleUserController implements RoleUserApi {

    @Resource
    private RoleUserService roleUserService;

    @PostMapping("/add")
    public void add(@RequestBody RoleUser roleUser) {
        roleUserService.save(roleUser);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  roleUserService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody RoleUser roleUser) {
        return roleUserService.update(roleUser);
    }

    @PostMapping("/detail")
    public RoleUser detail(@RequestParam Long id) {
        return  roleUserService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<RoleUser>> list(@RequestBody RoleUserCondition roleUserCondition) {
        PageHelper.startPage(roleUserCondition.getPageNum(), roleUserCondition.getPageSize());
        List<RoleUser> result = roleUserService.findAll();
        return new SimplePageInfo(result);
    }
}
