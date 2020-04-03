package com.joe.jojo.service;

import com.joe.jojo.dto.UmsPermissionNode;
import com.joe.jojo.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台用户权限管理Service
 * @Author: Joe
 * @Date: 2020/4/3 0003 上午 10:26
 */
public interface UmsPermissionService {

    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id,UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
