package org.scu.orthopaedics.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.scu.orthopaedics.dao.entity.UserDO;
import org.scu.orthopaedics.dao.mapper.UserMapper;
import org.scu.orthopaedics.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
}
