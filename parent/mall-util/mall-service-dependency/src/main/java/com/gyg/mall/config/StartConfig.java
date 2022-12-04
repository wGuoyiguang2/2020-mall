package com.gyg.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*****
 * 避免在 每个服务中都 加分页拦截器，在同一的配置类里添加这个，每个服务都 依赖  mall service dependency  这个jar
 * 每个服务在启动的时候就会加载分页拦截器
 ****/
@Configuration
public class StartConfig {

    /****
     * 分页拦截器
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor pageInterceptor = new PaginationInterceptor();
        // 设置数据类型
        pageInterceptor.setDbType(DbType.MYSQL);
        return pageInterceptor;
    }
}
