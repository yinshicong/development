package com.example.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
public class User {

    @NotEmpty(message = "姓名不能为空!!!")
    private String name;

    @Min(value = 10,message = "小姑娘不可以进哦~11111")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
