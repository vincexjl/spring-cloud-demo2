package net.biancheng.c.mapper;

/**
 * @author xiejiale
 * @date 2024/7/24 17:15
 **/

import net.biancheng.c.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);

    //获取表中的全部数据
    List<Dept> GetAll();
}
