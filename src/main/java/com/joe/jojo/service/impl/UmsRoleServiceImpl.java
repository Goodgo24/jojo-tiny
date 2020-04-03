package com.joe.jojo.service.impl;

import com.joe.jojo.dao.UmsRolePermissionRelationDao;
import com.joe.jojo.mbg.mapper.UmsRoleMapper;
import com.joe.jojo.mbg.mapper.UmsRolePermissionRelationMapper;
import com.joe.jojo.mbg.model.UmsPermission;
import com.joe.jojo.mbg.model.UmsRole;
import com.joe.jojo.mbg.model.UmsRoleExample;
import com.joe.jojo.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Author: Joe
 * @Date: 2020/4/3 0003 上午 10:21
 */
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleMapper roleMapper;
    @Autowired
    private UmsRolePermissionRelationMapper rolePermissionRelationMapper;
    @Autowired
    private UmsRolePermissionRelationDao rolePermissionRelationDao;

    @Override
    public int create(UmsRole role) {
        role.setCreateTime(new Date());
        role.setStatus(1);
        role.setAdminCount(0);
        role.setSort(0);
        return roleMapper.insert(role);
    }

    @Override
    public int update(Long id, UmsRole role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int delete(List<Long> ids) {
        UmsRoleExample example = new UmsRoleExample();
        example.createCriteria().andIdIn(ids);
        return roleMapper.deleteByExample(example);
    }

    @Override
    public List<UmsPermission> getPermissionList(Long roleId) {
        return rolePermissionRelationDao.getPermissionList(roleId);
    }

    @Override
    public int updatePermission(Long roleId, List<Long> permissionIds) {
        return 0;
    }

    @Override
    public List<UmsRole> list() {
        return null;
    }
}
