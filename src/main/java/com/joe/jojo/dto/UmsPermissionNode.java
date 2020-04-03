package com.joe.jojo.dto;

import com.joe.jojo.mbg.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

/**
 * @Author: Joe
 * @Date: 2020/4/3 0003 上午 10:27
 */
public class UmsPermissionNode extends UmsPermission {

    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
