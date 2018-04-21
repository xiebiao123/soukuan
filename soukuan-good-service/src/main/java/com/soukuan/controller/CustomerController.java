package com.soukuan.controller;

import com.github.pagehelper.PageHelper;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.domain.po.Customer;
import com.soukuan.service.CustomerService;
import com.soukuan.web.Pager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Title
* Author xiebiao@wshifu.com
* DateTime  2018-04-21.
* Version V1.0.0
*/
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @PostMapping("/add")
    public Object add(Customer customer) {
        customerService.save(customer);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam Long id) {
        int result = customerService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public Object update(Customer customer) {
        int result =  customerService.update(customer);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public Object detail(@RequestParam Long id) {
        Customer customer = customerService.findById(id);
        return  ResponseEntityBuilder.success(customer);
    }

    @PostMapping("/list")
    public Object list(Customer customer,Pager pager) {
        PageHelper.startPage(pager.getPageNum(), pager.getPageSize());
        List<Customer> list = customerService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
