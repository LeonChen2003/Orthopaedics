package org.scu.orthopaedics.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.scu.orthopaedics.dao.entity.SurgeonRelatedDO;
import org.scu.orthopaedics.dto.req.SurgeonRegisterReqDTO;

public interface SurgeonService extends IService<SurgeonRelatedDO> {

    /**
     * 医生注册
     * @param requestParam 医生注册相关参数
     */
    void surgeonRegister(SurgeonRegisterReqDTO requestParam);
}
