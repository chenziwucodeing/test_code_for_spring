package com.chenzizi.action;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenzizi.entity.CollectUserDO;
import com.chenzizi.service.ICollectUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testAction")
public class TestAction {
    @Autowired
    private ICollectUserService collectUserService;

    @RequestMapping(value = "/f1")
    public String f1() {
        collectUserService.f1();
        return "OK";
    }

    @RequestMapping(value = "/f2")
    public String f2() {
        collectUserService.f2();
        return "OK";
    }
}
