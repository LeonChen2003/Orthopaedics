package org.scu.orthopaedics.controller;

import lombok.RequiredArgsConstructor;
import org.scu.orthopaedics.common.result.Result;
import org.scu.orthopaedics.common.result.Results;
import org.scu.orthopaedics.dto.req.UserLoginReqDTO;
import org.scu.orthopaedics.dto.req.UserRegisterReqDTO;
import org.scu.orthopaedics.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 用户控制层
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orthopaedics/admin/user")
public class UserController {
    private final UserService userService;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public Result<Void> register(@RequestBody UserRegisterReqDTO userRegisterReqDTO) {
        userService.register(userRegisterReqDTO);
        return Results.success();
    }

    /**
     *用户登录
     */
    @PostMapping("/login")
    public Result<Void> login(@RequestBody UserLoginReqDTO userLoginReqDTO){
        userService.login(userLoginReqDTO);
        return Results.success();
    }

    /**
     *用户删除
     */
    @GetMapping("/delete")
    public Result<Void> delete(@RequestParam String username){
        userService.delete(username);
        return Results.success();
    }

}
