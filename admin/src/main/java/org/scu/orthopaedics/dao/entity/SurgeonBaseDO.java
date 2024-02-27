package org.scu.orthopaedics.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.hssf.record.SSTRecord;
import org.scu.orthopaedics.common.BaseDO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_surgeon_base_information")
public class SurgeonBaseDO extends BaseDO {
    private Long id;
    private String username;
    private String password;
    private String real_name;
    private String phone;
    private String mail;
}
