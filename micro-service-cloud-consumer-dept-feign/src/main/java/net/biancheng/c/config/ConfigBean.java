package net.biancheng.c.config;

/**
 * @author xiejiale
 * @date 2024/7/26 15:48
 **/

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    /**
     * OpenFeign 日志增强
     * 配置 OpenFeign 记录哪些内容
     */
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}