package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.CustomerCondition;
import com.soukuan.common.good.domain.Customer;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.CustomerService;
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
public class CustomerClientImpl implements CustomerClient {

    @Resource
    private CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity add(Customer customer) {
        customerService.save(customer);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = customerService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Customer customer) {
        int result =  customerService.update(customer);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Customer customer = customerService.findById(id);
        return  ResponseEntityBuilder.success(customer);
    }

    @PostMapping("/list")
    public ResponseEntity list(CustomerCondition customer) {
        PageHelper.startPage(customer.getPageNum(), customer.getPageSize());
        List<Customer> list = customerService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
