package com.quanxiaoha.xiaohashu.auth.controller;
import com.quanxiaoha.framework.biz.operationlog.aspect.ApiOperationLog;
import com.quanxiaoha.framework.common.response.Response;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test(){
        return Response.success();
    }
    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> localTest(){
        return Response.success(User.builder().nickName("chai").createTime(LocalDateTime.now()).build());
    }
    @PostMapping("/test3")
    public Response<User> localTest3(@RequestBody User user){
        return Response.success(user);
    }
}
