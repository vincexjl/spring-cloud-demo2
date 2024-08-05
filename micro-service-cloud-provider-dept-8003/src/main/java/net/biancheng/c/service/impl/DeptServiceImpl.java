package net.biancheng.c.service.impl;

/**
 * @author xiejiale
 * @date 2024/7/25 15:01
 **/

import net.biancheng.c.entity.Dept;
import net.biancheng.c.mapper.DeptMapper;
import net.biancheng.c.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}