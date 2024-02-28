package org.scu.orthopaedics.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 医生注册请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SurgeonRegisterReqDTO {
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
    private String province;
    private String city;
    private Integer doctorFlag;
    private String hospital;
    private String workProvince;
    private String workCity;
    private String code;
    private String certificationPicture;
    private String identityCard;
}
