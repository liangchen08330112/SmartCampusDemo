package cn.edu.sict.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.edu.sict.mapper")
public class MyConfig {
    /**
     * 分页插件
     */
    public PaginationInterceptor interceptor(){
        PaginationInterceptor interceptor = new PaginationInterceptor();
//        interceptor.setLimit();
        return interceptor;
    }
}
