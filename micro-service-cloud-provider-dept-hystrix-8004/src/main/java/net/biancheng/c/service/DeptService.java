package net.biancheng.c.service;

/**
 * @author xiejiale
 * @date 2024/8/5 11:01
 **/

public interface DeptService {

    // hystrix 熔断器示例 ok
    public String deptInfo_Ok(Integer id);

    //hystrix 熔断器超时案例
    public String deptInfo_Timeout(Integer id);
}
