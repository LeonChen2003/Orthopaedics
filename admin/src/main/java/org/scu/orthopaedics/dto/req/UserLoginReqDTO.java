package org.scu.orthopaedics.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class UserLoginReqDTO {
    private String username;
    private String password;
}
