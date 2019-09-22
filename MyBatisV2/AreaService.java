package com.welearn.service;

import com.welearn.entity.po.common.Area;
import com.welearn.entity.qo.common.AreaQueryCondition;
import org.springframework.validation.annotation.Validated;

/**
 * Description : AreaService Interface
 * Created by Setsuna Jin on 2018/1/8.
 */
@Validated
public interface AreaService extends BaseService<Area, AreaQueryCondition>{

}