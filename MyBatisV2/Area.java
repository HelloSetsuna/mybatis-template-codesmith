package com.welearn.entity.po.common;

import java.util.Date;
import com.welearn.entity.po.BasePersistant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Persistent Object : ryme_common : area
 * @author Setsuna Jin Generate By CodeSmith 7.0 At 2019/5/6 9:48:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Area", description = "Area 领域实体")
public class Area extends BasePersistant
{
    /**
     * Description  : 名称
     * Constraint   : [NOT NULL] 
     * TableColumn   : [ryme_common:varchar][SIZE:36]
     */
    @NotBlank
    @ApiModelProperty( value = "名称", allowEmptyValue = false, position = 4 )
    private String name;
    
    /**
     * Description  : 描述
     * Constraint   : [CAN NULL]
     * TableColumn   : [ryme_common:varchar][SIZE:128]
     */
    @ApiModelProperty( value = "描述", allowEmptyValue = true, position = 5 )
    private String description;
    
    /**
     * Description  : 公司id
     * Constraint   : [NOT NULL] 
     * TableColumn   : [ryme_common:varchar][SIZE:36]
     */
    @NotBlank
    @ApiModelProperty( value = "公司id", allowEmptyValue = false, position = 6 )
    private String companyId;
    
    /**
     * Description  : 地址id
     * Constraint   : [CAN NULL]
     * TableColumn   : [ryme_common:varchar][SIZE:36]
     */
    @ApiModelProperty( value = "地址id", allowEmptyValue = true, position = 7 )
    private String addressId;
    
    /**
     * Description  : 区域照片
     * Constraint   : [CAN NULL]
     * TableColumn   : [ryme_common:text][SIZE:16383]
     */
    @ApiModelProperty( value = "区域照片", allowEmptyValue = true, position = 8 )
    private String photos;
    
}
