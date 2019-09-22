package com.welearn.mapper;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.welearn.entity.po.common.Area;
import com.welearn.entity.qo.common.AreaQueryCondition;
import org.apache.ibatis.annotations.Mapper;

/**
 * Area Mapper Interface : ryme_common : area
 * @author Setsuna Jin Generate By CodeSmith 7.0 At 2019/5/6 9:48:57
 * @see com.welearn.entity.po.common.Area
 */
@Mapper 
public interface AreaMapper extends BaseMapper<Area, AreaQueryCondition> {
    
    
    
    
    
    
    
    
    // --------------------------------------------------------------------------------------------
    
    /**
     * 按主键查询数据
     * @param  id entity Id
     * @return 实体 对象
     */
    @Override
    // @Cacheable(value = "areaMapper", key = "'area:'+#id", unless = "#result == null")
    Area selectByPK(String id);
    
    /**
     * 更新数据（全部）
     * @param  entity 实体
     * @return 操作影响行数
     */
    @Override
    // @CachePut(value = "areaMapper", key = "'area:'+#entity.id", unless = "#entity.id == null")
    int updateByPK(Area entity);

    /**
     * 更新数据（选择）
     * @param  entity 实体
     * @return 操作影响行数
     */
    @Override
    // @CachePut(value = "areaMapper", key = "'area:'+#entity.id", unless = "#entity.id == null")
    int updateByPKSelective(Area entity);

    /**
     * 标记数据可用
     * @param id 主键
     * @return 操作影响行数
     */
    @Override
    // @CacheEvict(value = "areaMapper", key = "'area:'+#id")
    int enable(String id);

    /**
     * 标记数据不可用
     * @param id 主键
     * @return 操作影响行数
     */
    @Override
    // @CacheEvict(value = "areaMapper", key = "'area:'+#id")
    int disable(String id);

    /**
     * 根据主键删除
     * @param  id entityId
     * @return 操作影响行数
     */
    @Override
    // @CacheEvict(value = "areaMapper", key = "'area:'+#id")
    int deleteByPK(String id);

    /**
     * 删除全部数据
     * @return 操作影响行数
     */
    @Override
    // @CacheEvict(value = "areaMapper", allEntries = true)
    int deleteAll();
    
    // --------------------------------------------------------------------------------------------
}
