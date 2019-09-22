package com.welearn.service;

import com.welearn.entity.po.BasePersistant;
import com.welearn.error.exception.DbOperationFailedException;
import com.welearn.validate.annotation.common.EntityCheck;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Description : 基础业务接口
 * Created by Setsuna Jin on 2018/1/7.
 */
@Validated
public interface BaseService<T extends BasePersistant, Q extends T> {
    /**
     * 业务实体查询
     * @param queryCondition 查询条件
     * @throws DbOperationFailedException 数据库异常
     * @return 业务实体列表
     */
    List<T> search(@NotNull Q queryCondition) throws DbOperationFailedException;

    /**
     * 查询业务实体
     * @param id 主键
     * @return 业务实体
     * @throws DbOperationFailedException 数据库异常
     */
    T select(@NotNull String id) throws DbOperationFailedException;

    /**
     * 添加业务实体
     * @param entity 业务实体
     */
    T create(@EntityCheck @Valid T entity) throws DbOperationFailedException;

    /**
     * 更新业务实体
     * @param entity 业务实体
     */
    void update(@EntityCheck(checkId = true) T entity) throws DbOperationFailedException;

    /**
     * 删除业务实体
     * @param entity 业务实体
     */
    void delete(@EntityCheck(checkId = true) T entity) throws DbOperationFailedException;
    void delete(@NotNull String id) throws DbOperationFailedException;

    /**
     * 启用业务实体
     * @param entity 业务实体
     */
    void enable(@EntityCheck(checkId = true) T entity) throws DbOperationFailedException;
    void enable(@NotNull String id) throws DbOperationFailedException;
    /**
     * 禁用业务实体
     * @param entity 业务实体
     */
    void disable(@EntityCheck(checkId = true) T entity) throws DbOperationFailedException;
    void disable(@NotNull String id) throws DbOperationFailedException;
}

