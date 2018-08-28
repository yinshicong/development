package com.example;

import com.example.dto.User;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2018/7/31 0031.
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ConcurrentHashMap<String,User> userConcurrentHashMap = new ConcurrentHashMap<>();


    }

    private String tt(){
        return "hello task";
    }

}
