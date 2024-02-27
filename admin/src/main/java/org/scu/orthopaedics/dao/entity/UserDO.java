package org.scu.orthopaedics.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scu.orthopaedics.common.database.BaseDO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_user")
public class UserDO extends BaseDO {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
    private String province;
    private String city;
    private Integer doctorFlag;
}
