package com.welearn.service.impl;

import com.welearn.entity.po.BasePersistant;
import com.welearn.error.exception.DbOperationFailedException;
import com.welearn.mapper.BaseMapper;
import com.welearn.service.BaseService;
import com.welearn.util.UUIDGenerator;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * Description : 基础业务服务接口实现
 * Created by Setsuna Jin on 2018/1/7.
 */
public abstract class BaseServiceImpl<T extends BasePersistant, Q extends T, M extends BaseMapper<T, Q>>
        implements BaseService<T, Q> {

    /**
     * 获取该实体的 Mapper 对象
     * @return Mapper 对象
     */
    abstract M getMapper();

    /**
     * 业务实体查询
     * @param queryCondition 查询条件
     * @throws DbOperationFailedException 数据库异常
     * @return 业务实体列表
     */
    @Transactional
    public List<T> search(Q queryCondition) throws DbOperationFailedException{
        return getMapper().selectByCondition(queryCondition);
    }

    /**
     * 查询业务实体
     * @param id 主键
     * @return 业务实体
     * @throws DbOperationFailedException 数据库异常
     */
    @Transactional
    public T select(String id) throws DbOperationFailedException {
        try {
            return getMapper().selectByPK(id);
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    /**
     * 添加业务实体
     *
     * @param entity 业务实体
     */
    @Transactional
    public T create(T entity) throws DbOperationFailedException {
        try {
            if (Objects.isNull(entity.getId()))
                entity.setId(UUIDGenerator.get(entity.getClass()));
            int result = getMapper().insertSelective(entity);
            if (result != 1)
                throw new DbOperationFailedException("Insert Operation Effect %d Row", result);
            return entity;
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    /**
     * 更新业务实体
     *
     * @param entity 业务实体
     */
    @Transactional
    public void update(T entity) throws DbOperationFailedException {
        try {
            int result = getMapper().updateByPKSelective(entity);
            if (result != 1)
                throw new DbOperationFailedException("Update Operation Effect %d Row", result);
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    /**
     * 删除业务实体
     *
     * @param entity 业务实体
     */
    @Transactional
    public void delete(T entity) throws DbOperationFailedException {
        this.delete(entity.getId());
    }

    /**
     * 启用业务实体
     *
     * @param entity 业务实体
     */
    @Transactional
    public void enable(T entity) throws DbOperationFailedException {
        try {
            int result = getMapper().enable(entity.getId());
            if (result != 1)
                throw new DbOperationFailedException("Enable Operation Effect %d Row", result);
            else
                entity.setIsEnable(true);
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    /**
     * 禁用业务实体
     *
     * @param entity 业务实体
     */
    @Transactional
    public void disable(T entity) throws DbOperationFailedException {
        try {
            int result = getMapper().disable(entity.getId());
            if (result != 1)
                throw new DbOperationFailedException("Disable Operation Effect %d Row", result);
            else
                entity.setIsEnable(false);
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    @Transactional
    public void delete(String id) throws DbOperationFailedException {
        try {
            int result = getMapper().deleteByPK(id);
            if (result != 1)
                throw new DbOperationFailedException("Delete Operation Effect %d Row", result);
        }
        catch (Exception e){
            throw new DbOperationFailedException(e);
        }
    }

    @Transactional
    public void enable(String id) throws DbOperationFailedException {
        int result = getMapper().enable(id);
        if (result != 1)
            throw new DbOperationFailedException("Enable Operation Effect %d Row", result);
    }

    @Transactional
    public void disable(String id) throws DbOperationFailedException {
        int result = getMapper().disable(id);
        if (result != 1)
            throw new DbOperationFailedException("Disable Operation Effect %d Row", result);
    }
}
