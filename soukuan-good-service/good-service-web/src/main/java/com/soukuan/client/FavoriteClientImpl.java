package com.soukuan.client;

import com.github.pagehelper.PageHelper;
import com.soukuan.common.good.condition.FavoriteCondition;
import com.soukuan.common.good.domain.Favorite;
import com.soukuan.domain.ResponseEntity;
import com.soukuan.domain.ResponseEntityBuilder;
import com.soukuan.service.FavoriteService;
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
@RequestMapping("favorite")
public class FavoriteClientImpl implements FavoriteClient {
    @Resource
    private FavoriteService favoriteService;

    @PostMapping("/add")
    public ResponseEntity add(Favorite favorite) {
        favoriteService.save(favorite);
        return ResponseEntityBuilder.success();
    }

    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        int result = favoriteService.deleteById(id);
        return  ResponseEntityBuilder.success(result);
    }

    @PostMapping("/update")
    public ResponseEntity update(Favorite favorite) {
        int result =  favoriteService.update(favorite);
        return ResponseEntityBuilder.success(result);
    }

    @PostMapping("/detail")
    public ResponseEntity detail(@RequestParam Long id) {
        Favorite favorite = favoriteService.findById(id);
        return  ResponseEntityBuilder.success(favorite);
    }

    @PostMapping("/list")
    public ResponseEntity list(FavoriteCondition favorite) {
        PageHelper.startPage(favorite.getPageNum(), favorite.getPageSize());
        List<Favorite> list = favoriteService.findAll();
        return ResponseEntityBuilder.successPage(list);
    }
}
