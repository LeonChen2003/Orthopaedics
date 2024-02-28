package org.scu.orthopaedics.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.jdbc.Null;
import org.scu.orthopaedics.common.exception.ClientException;
import org.scu.orthopaedics.dao.entity.UserDO;
import org.scu.orthopaedics.dao.mapper.UserMapper;
import org.scu.orthopaedics.dto.req.UserLoginReqDTO;
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

    @Override
    public void delete(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, username);
        baseMapper.delete(queryWrapper);
    }

    @Override
    public void login(UserLoginReqDTO userLoginReqDTO) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, userLoginReqDTO.getUsername()).eq(UserDO::getPassword, userLoginReqDTO.getPassword());
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if (userDO == null){
            throw new ClientException("请输入正确账户密码");
        }
    }
}
