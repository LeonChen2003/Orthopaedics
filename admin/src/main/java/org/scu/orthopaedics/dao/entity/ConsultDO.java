package org.scu.orthopaedics.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scu.orthopaedics.common.database.BaseDO;

/**
 * 问诊实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_consult")
public class ConsultDO extends BaseDO {
    private Long id;
    private Long prescriptionId;
    private String patientUsername;
    private String hospital;
    private String department;
    private String surgeonUsername;
    private String symptomDescription;
    private String symptomAnswer;
    private Integer isAnswer;
    private Integer isPrescribe;
}
