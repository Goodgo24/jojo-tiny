package com.joe.jojo.dao;

import com.joe.jojo.mbg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Joe
 * @Date: 2020/4/3 0003 下午 5:24
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
