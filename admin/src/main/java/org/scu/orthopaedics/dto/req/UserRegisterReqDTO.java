package org.scu.orthopaedics.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterReqDTO {
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
    private String province;
    private String city;
    private Integer doctorFlag;
}
