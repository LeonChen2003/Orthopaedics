package org.scu.orthopaedics.controller;

import lombok.RequiredArgsConstructor;
import org.scu.orthopaedics.common.result.Result;
import org.scu.orthopaedics.common.result.Results;
import org.scu.orthopaedics.dto.req.SurgeonRegisterReqDTO;
import org.scu.orthopaedics.service.SurgeonService;
import org.springframework.web.bind.annotation.*;

/**
 * 医生控制层
 */
@RestController
@RequestMapping("/api/orthopaedics/admin/surgeon")
@RequiredArgsConstructor
public class SurgeonController {

    private final SurgeonService surgeonService;

    /**
     * 医生注册
     */
    @PostMapping("/register")
    public Result<Void> surgeonRegister(@RequestBody SurgeonRegisterReqDTO requestParam){
        surgeonService.surgeonRegister(requestParam);
        return Results.success();
    }

    @GetMapping("/delete")
    public Result<Void> surgeonDelete(@RequestParam String username){
        surgeonService.delete(username);
        return Results.success();
    }

}
