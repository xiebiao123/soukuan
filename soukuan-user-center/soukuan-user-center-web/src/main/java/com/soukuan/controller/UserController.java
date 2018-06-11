package com.soukuan.controller;

import com.soukuan.api.UserApi;
import com.soukuan.domains.po.User;
import com.soukuan.domains.condition.UserCondition;
import com.soukuan.web.page.Pager;
import com.soukuan.web.page.SimplePageInfo;
import com.soukuan.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@RestController
@RequestMapping("user")
public class UserController implements UserApi {

    @Resource
    private UserService userService;

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam Long id) {
        return  userService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping("/detail")
    public User detail(@RequestParam Long id) {
        return  userService.findById(id);
    }

    @PostMapping("/list")
    public SimplePageInfo<List<User>> list(@RequestBody UserCondition userCondition) {
        Pager pager = userCondition.getPager();
        if(Objects.isNull(pager)){
            pager = new Pager(1,10);
        }
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<User> result = userService.find(userCondition.getUser());
        return new SimplePageInfo(result);
    }
}
