package net.biancheng.c.service;

/**
 * @author xiejiale
 * @date 2024/8/5 17:12
 **/

import org.springframework.stereotype.Component;

/**
 * Hystrix 服务降级
 * 解耦回退逻辑
 */
@Component
public class DeptHystrixFallBackService implements DeptHystrixService {
    @Override
    public String deptInfo_Ok(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }

    @Override
    public String deptInfo_Timeout(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
}
