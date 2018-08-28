package com.example.controller;

import com.example.util.TokenUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Administrator on 2018/6/22 0022.
 */
@RestController
public class TokenController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(TokenController.class);

    @RequestMapping("/validata/token")
    public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.error("WechatController   ----   WechatController");

        System.out.println("========WechatController========= ");
        logger.info("请求进来了...");

        Enumeration pNames = request.getParameterNames();
        while (pNames.hasMoreElements()) {
            String name = (String) pNames.nextElement();
            String value = request.getParameter(name);
            // out.print(name + "=" + value);

            String log = "name =" + name + "     value =" + value;
            logger.error(log);
        }

        String signature = request.getParameter("signature");/// 微信加密签名
        String timestamp = request.getParameter("timestamp");/// 时间戳
        String nonce = request.getParameter("nonce"); /// 随机数
        String echostr = request.getParameter("echostr"); // 随机字符串
        PrintWriter out = response.getWriter();

        if (TokenUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
        out = null;

    }

}
