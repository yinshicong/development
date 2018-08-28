package com.example.filter;

import com.example.anno.Call;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.core.Conventions;
import org.springframework.core.MethodParameter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
@Component
public class MyUserArgumentResolver implements HandlerMethodArgumentResolver{

    /**
     *  MethodParameter方法参数对象 通过它可以获取该方法参数上的一些信息 如方法参数中的注解信息等
     *  通过该方法我们如果需要对某个参数进行处理  只要此处返回true即可 如对Date类型数据处理的话
     *
     * @param methodParameter
     * @return
     */
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        System.out.println(this.getClass().getName());
        //方法上面带有@Call注解的都需要被拦截下来。
        return methodParameter.getMethodAnnotation(Call.class) != null;
    }

    /**
     * 真正用于处理参数分解的方法，返回的Object就是controller方法上的形参对象。
     * @param parameter
     * @param mavContainer
     * @param webRequest
     * @param binderFactory
     * @return
     * @throws Exception
     */
    @Override
    public Object resolveArgument(MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory) throws Exception {

        HttpServletRequest request = ((ServletWebRequest) webRequest).getRequest();
//        BufferedReader br;
//        StringBuilder sb = null;
//        String reqBody = null;
//        br = new BufferedReader(new InputStreamReader(
//                request.getInputStream()));
//        String line = null;
//        sb = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sb.append(line);
//        }
//        reqBody = URLDecoder.decode(sb.toString(), "UTF-8");
//        reqBody = reqBody.substring(reqBody.indexOf("{"));
//        request.setAttribute("inputParam", reqBody);
//        System.out.println("JsonReq reqBody>>>>>" + reqBody);
//        System.out.println("自己的业务逻辑");
        Gson gson = new Gson();
//        new JsonObject(reqBody);

        String param = request.getParameter(parameter.getParameterName());
        Class c = parameter.getParameterType();
        return param;
    }

}
