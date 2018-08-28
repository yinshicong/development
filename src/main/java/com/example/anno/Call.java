package com.example.anno;

import org.springframework.web.bind.annotation.RequestBody;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/8/1 0001.
 */
@Target({
        ElementType.PARAMETER,
        ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Call {

    String value = "";

}
