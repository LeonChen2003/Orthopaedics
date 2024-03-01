package org.scu.orthopaedics.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 医院实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_hospital")
public class HospitalDO {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String hospitalName;
    private Integer rank;
    private String province;
    private String city;
    private String description;
}
