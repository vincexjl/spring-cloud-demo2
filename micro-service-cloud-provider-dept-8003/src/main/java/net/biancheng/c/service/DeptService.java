package net.biancheng.c.service;

/**
 * @author xiejiale
 * @date 2024/7/25 15:01
 **/

import net.biancheng.c.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);

    List<Dept> selectAll();
}
