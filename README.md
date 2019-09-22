# Mybatis-Template-CodeSmith
`使用 CodeSmith 根据数据库，生成使用 Mybatis 框架时所需的 Mapper Interface、Mapper XML、PO类、默认的空的 Service 和 ServiceImpl类文件`

## V1 -> V2
```
之前公司SpringCloud项目中使用MyBatis时，对V1版本的模板进行了部分修改，处理了部分BUG，添加了一些新功能，注意是UUID类型的ID。
```
+ 添加了对 `Lombok`、`Swagger2`、`SpringCache`、`SpringValidation` 的支持。
+ 为 PO类 添加了父类 `详见 MyBatisV2/Super/BasePersistant.java`。
+ 为 Mapper Interface类 添加了父类 `详见 MyBatisV2/Super/BaseMapper.java`。
+ 为 Service类 添加了父类 `详见 MyBatisV2/Super/BaseService.java` 及其抽象实现 `详见 MyBatisV2/Super/BaseServiceImpl.java`。
+ 添加了`QueryCondition` 类的生成，查询时非实体内的查询参数（如createdAtStart/End）可放置此类中，Mapper中的查询参数是 `QueryCondition`，它继承自 `BasePersistant`。
+ 此外还有 `BaseController`, 均在 `MyBatisV2/Super/` 目录下，这些基类均可根据需求实现自行修改。

## 生成样例 Example

### PO类 作者、包名、生成路径均可在CodeSmith生成时指定，添加了Lombok、Swagger2、Validation 相关注解
``` java
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
```

### Mapper接口 添加了支持SpringCache的注解（默认注释掉了），在使用时可根据业务情况解除注释
``` java
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
    
    
    
    
    
    
    
    
    // ------------------------------------------------------------------------------
    
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
    
    // ------------------------------------------------------------------------------
}
```

### ServiceImpl类 其它的生成样例可查看 `MyBatisV2/Super` 目录下 Area*.* 文件
``` java
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
```

`对于如何使用可以参考下 MyBatisV1/README.md 的文件，在这就不赘述啦`