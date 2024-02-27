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
@TableName(value = "t_surgeon_related")
public class SurgeonRelatedDO extends BaseDO {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String hospital;
    private String workProvince;
    private String workCity;
    private String code;
    private String certificationPicture;
    private String identityCard;
}
