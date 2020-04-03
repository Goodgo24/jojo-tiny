package com.joe.jojo.dao;

import com.joe.jojo.mbg.model.UmsPermission;
import com.joe.jojo.mbg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Joe
 * @Date: 2020/4/3 0003 下午 5:29
 */
public interface UmsRolePermissionRelationDao {

    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
