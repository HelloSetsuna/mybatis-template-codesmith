package com.welearn.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Description : 基本实体
 * Created by Setsuna Jin on 2018/1/7.
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "数据库映射的实体类")
public class BasePersistant implements Serializable{
    /**
     * Description  : 主键
     * Constraint   : [NOT NULL] [Primary Key] [Unique]
     * TableColumn   : [bigint][PRECISION:20]
     */
    @ApiModelProperty(value = "主键", position = -1)
    private String id;

    /**
     * Description  : 创建时间
     * Constraint   : [NOT NULL]
     * TableColumn   : [timestamp]
     * DefaultValue : CURRENT_TIMESTAMP
     */
    @ApiModelProperty(value = "创建时间", position = 100)
    private Date createdAt;

    /**
     * Description  : 更新时间
     * Constraint   : [NOT NULL]
     * TableColumn   : [timestamp]
     * DefaultValue : CURRENT_TIMESTAMP
     */
    @ApiModelProperty(value = "更新时间", position = 101)
    private Date updatedAt;

    /**
     * Description  : 是否可用：0-不可用，1-可用
     * Constraint   : [NOT NULL]
     * TableColumn   : [tinyint][PRECISION:3]
     * DefaultValue : 1
     */
    @ApiModelProperty(value = "是否可用|false:禁用,true:可用", position = 102)
    private Boolean isEnable;
}
