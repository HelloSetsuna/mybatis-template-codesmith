package com.welearn.service.impl;

import com.welearn.entity.po.common.Area;
import com.welearn.entity.qo.common.AreaQueryCondition;
import com.welearn.mapper.AreaMapper;
import com.welearn.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description : AreaService Implement
 * Created by Setsuna Jin on 2018/1/8.
 */
@Service
public class AreaServiceImpl extends BaseServiceImpl<Area,AreaQueryCondition,AreaMapper>
        implements AreaService{
    
    @Autowired
    private AreaMapper areaMapper;
    
    @Override
    AreaMapper getMapper() {
        return areaMapper;
    }

}
