package com.example.configure;

import com.example.filter.MyUserArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.util.List;

/**
 * https://blog.csdn.net/lchpersonal521/article/details/53112728
 *
 * Created by Administrator on 2018/7/25 0025.
 */
@Configuration
public class DevConfig implements WebMvcConfigurer {

    @Autowired
    private MyUserArgumentResolver myUserArgumentResolver;

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }

    /**
     * 方法拦截
     * @param resolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(myUserArgumentResolver);
    }

    public static void main(String[] args) {




        System.out.println(new BigDecimal("0").intValue() == 0);
    }

}
