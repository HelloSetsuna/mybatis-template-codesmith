package com.welearn.controller;

import com.welearn.entity.po.BasePersistant;
import com.welearn.entity.vo.response.CommonResponse;
import com.welearn.service.BaseService;
import com.welearn.util.PaginateUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description :
 * Created by Setsuna Jin on 2018/4/3.
 */
public abstract class BaseController<T extends BasePersistant, Q extends T, S extends BaseService<T, Q>> {

    @Autowired protected S service;

    @ApiOperation(value = "数据条件查询", httpMethod = "POST")
    @RequestMapping(value = "/search")
    public CommonResponse<List<T>> search(@RequestBody Q queryCondition) {
        return new CommonResponse<>(PaginateUtil.page(()-> service.search(queryCondition)));
    }

    @ApiOperation(value = "数据单个查询", httpMethod = "POST")
    @RequestMapping(value = "/select")
    public CommonResponse<T> select(@RequestBody String id) {
        return new CommonResponse<>(service.select(id));
    }

    @ApiOperation(value = "数据创建", httpMethod = "POST")
    @RequestMapping(value = "/create")
    public CommonResponse<T> create(@RequestBody T entity) {
        return new CommonResponse<>(service.create(entity));
    }

    @ApiOperation(value = "数据更新", httpMethod = "POST")
    @RequestMapping(value = "/update")
    public CommonResponse update(@RequestBody T entity) {
        service.update(entity);
        return CommonResponse.getSuccessResponse();
    }

    @ApiOperation(value = "数据删除", httpMethod = "POST")
    @RequestMapping(value = "/delete")
    public CommonResponse delete(@RequestBody String id) {
        service.delete(id);
        return CommonResponse.getSuccessResponse();
    }

    @ApiOperation(value = "数据禁用", httpMethod = "POST")
    @RequestMapping(value = "/disable")
    public CommonResponse disable(@RequestBody String id) {
        service.disable(id);
        return CommonResponse.getSuccessResponse();
    }

    @ApiOperation(value = "数据启用", httpMethod = "POST")
    @RequestMapping(value = "/enable")
    public CommonResponse enable(@RequestBody String id) {
        service.enable(id);
        return CommonResponse.getSuccessResponse();
    }
}
