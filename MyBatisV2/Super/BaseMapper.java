package com.welearn.mapper;

import com.welearn.entity.po.BasePersistant;

import java.util.List;

/**
 * Description : 基础 Mapper
 * Created by Setsuna Jin on 2018/1/7.
 */
public interface BaseMapper<T extends BasePersistant, Q extends T> {
    /**
     * 按主键查询数据
     * @param  id entity Id
     * @return 实体 对象
     */
    T selectByPK(String id);

    /**
     * 按查询条件查询数据
     * @param condition 基础查询条件
     * @return 实体对象列表
     */
    List<T> selectByCondition(Q condition);

    /**
     * 查询所有数据
     * @return 实体 集合
     */
    List<T> selectAll();

    /**
     * 添加数据（全部）
     * @param  entity 实体
     * @return 操作影响行数
     */
    int insert(T entity);

    /**
     * 添加数据（选择）
     * @param  entity 实体
     * @return 操作影响行数
     */
    int insertSelective(T entity);

    /**
     * 更新数据（全部）
     * @param  entity 实体
     * @return 操作影响行数
     */
    int updateByPK(T entity);

    /**
     * 更新数据（选择）
     * @param  entity 实体
     * @return 操作影响行数
     */
    int updateByPKSelective(T entity);

    /**
     * 标记数据可用
     * @param id 主键
     * @return 操作影响行数
     */
    int enable(String id);

    /**
     * 标记数据不可用
     * @param id 主键
     * @return 操作影响行数
     */
    int disable(String id);

    /**
     * 根据主键删除
     * @param  id entityId
     * @return 操作影响行数
     */
    int deleteByPK(String id);

    /**
     * 删除全部数据
     * @return 操作影响行数
     */
    int deleteAll();

    /**
     * 获取数据条数
     * @return 数据表数据条数
     */
    int countAll();
}
