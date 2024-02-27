package org.scu.orthopaedics.controller;

import lombok.RequiredArgsConstructor;
import org.scu.orthopaedics.common.result.Result;
import org.scu.orthopaedics.common.result.Results;
import org.scu.orthopaedics.dto.req.UserRegisterReqDTO;
import org.scu.orthopaedics.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orthopaedics/admin/surgeon")
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
}
