package com.drp.mapper;

import com.drp.po.Admin;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Admin Mapper Interface : drpb2b2c : admin
 * @author Setsuna Jin Generate By CodeSmith 7.0 At 2017/10/10 19:50:57
 * @see com.drp.po.Admin
 */
@Service public interface AdminMapper {
    /**
     * 按主键查询数据
     * @param  id adminId
     * @return admin 对象
     */
    Admin selectByPK(Integer id);
    
    /**
     * 查询所有数据
     * @return admin 集合
     */
    List<Admin> selectAll();

    /**
     * 添加数据（全部）
     * @param  admin admin
     * @return 操作影响行数
     */
    int insert(Admin admin);
    
    /**
     * 添加数据（选择）
     * @param  admin admin
     * @return 操作影响行数
     */
    int insertSelective(Admin admin);
    
    /**
     * 更新数据（全部）
     * @param  admin admin
     * @return 操作影响行数
     */
    int updateByPK(Admin admin);
    
    /**
     * 更新数据（选择）
     * @param  admin admin
     * @return 操作影响行数
     */
    int updateByPKSelective(Admin admin);
    
    /**
     * 根据主键删除
     * @param  id adminId
     * @return 操作影响行数
     */
    int deleteByPK(Integer id);
    
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