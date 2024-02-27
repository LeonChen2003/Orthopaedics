package org.scu.orthopaedics.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.scu.orthopaedics.dao.entity.UserDO;
import org.scu.orthopaedics.dao.mapper.UserMapper;
import org.scu.orthopaedics.dto.req.UserRegisterReqDTO;
import org.scu.orthopaedics.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    private final UserMapper userMapper;

    @Override
    public void register(UserRegisterReqDTO userRegisterReqDTO) {
        baseMapper.insert(BeanUtil.copyProperties(userRegisterReqDTO, UserDO.class));
    }
}
