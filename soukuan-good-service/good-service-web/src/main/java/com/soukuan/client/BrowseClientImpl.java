package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.BrowseCondition;
import com.soukuan.common.good.domain.Browse;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.BrowseService;
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
@RequestMapping("browse")
public class BrowseClientImpl implements BrowseClient {
    @Resource
    private BrowseService browseService;

    @PostMapping("/add")
    public ResponseEntity add(Browse browse) {
        browseService.save(browse);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = browseService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Browse browse) {
        int result =  browseService.update(browse);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Browse browse = browseService.findById(id);
        return  ResponseEntityBuilder.success(browse);
    }

    @PostMapping("/list")
    public ResponseEntity list(BrowseCondition browse) {
        PageHelper.startPage(browse.getPageNum(), browse.getPageSize());
        List<Browse> list = browseService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
