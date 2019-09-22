package com.welearn.entity.qo.common;

import com.welearn.entity.po.common.Area;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;

/**
 * Description : Area Query Condition
 * Created by Setsuna Jin.
 * @author Setsuna Jin Generate By CodeSmith 7.0 At 2019/5/6 9:48:57
 * @see com.welearn.entity.po.common.Area
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ApiModel(value = "AreaQueryCondition", description = "Area 查询条件")
public class AreaQueryCondition extends Area {

}
