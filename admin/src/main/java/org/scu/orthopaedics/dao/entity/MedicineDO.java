package org.scu.orthopaedics.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 药品实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_medicine")
public class MedicineDO {
    @TableId(type = IdType.ASSIGN_ID)
    private Integer medicineID;
    private String medicineName;
    private Integer takingWay;
    private String dosage;
    private Integer taking_count_day;
    private String tips;
}
