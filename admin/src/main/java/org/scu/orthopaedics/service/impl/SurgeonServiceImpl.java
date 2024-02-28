package org.scu.orthopaedics.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.scu.orthopaedics.dao.entity.SurgeonRelatedDO;
import org.scu.orthopaedics.dao.entity.UserDO;
import org.scu.orthopaedics.dao.mapper.SurgeonMapper;
import org.scu.orthopaedics.dao.mapper.UserMapper;
import org.scu.orthopaedics.dto.req.SurgeonRegisterReqDTO;
import org.scu.orthopaedics.service.SurgeonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SurgeonServiceImpl extends ServiceImpl<SurgeonMapper, SurgeonRelatedDO> implements SurgeonService {

    private final UserMapper userMapper;
    private final SurgeonMapper surgeonMapper;

    @Override
    @Transactional
    public void surgeonRegister(SurgeonRegisterReqDTO requestParam) {
        UserDO userDO = BeanUtil.copyProperties(requestParam, UserDO.class);
        userMapper.insert(userDO);
        SurgeonRelatedDO surgeonRelatedDO = BeanUtil.copyProperties(requestParam, SurgeonRelatedDO.class);
        surgeonMapper.insert(surgeonRelatedDO);
    }
}
