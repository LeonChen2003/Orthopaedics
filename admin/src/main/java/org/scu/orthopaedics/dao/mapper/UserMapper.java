package org.scu.orthopaedics.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.scu.orthopaedics.dao.entity.UserDO;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
