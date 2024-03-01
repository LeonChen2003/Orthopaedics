package org.scu.orthopaedics.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.scu.orthopaedics.dao.entity.SurgeonRelatedDO;
import org.scu.orthopaedics.dto.req.SurgeonLoginReqDTO;
import org.scu.orthopaedics.dto.req.SurgeonRegisterReqDTO;

public interface SurgeonService extends IService<SurgeonRelatedDO> {

    /**
     * 医生注册
     * @param requestParam 医生注册相关参数
     */
    void surgeonRegister(SurgeonRegisterReqDTO requestParam);

    /**
     *医生删除
     * @param username 医生用户名
     */
    void delete(String username);

    /**
     * 医生登录
     * @param surgeonLoginReqDTO 医生登录相关参数
     */
    void login(SurgeonLoginReqDTO surgeonLoginReqDTO);
}
