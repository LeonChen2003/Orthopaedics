package org.scu.orthopaedics.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.scu.orthopaedics.dao.entity.UserDO;
import org.scu.orthopaedics.dto.req.UserRegisterReqDTO;

public interface UserService extends IService<UserDO> {
    /**
     * 用户注册
     * @param userRegisterReqDTO 用户注册请求参数
     */
    void register(UserRegisterReqDTO userRegisterReqDTO);

    /**
     * 用户删除
     * @param username 用户删除请求参数
     */
    void delete(String username);
}
