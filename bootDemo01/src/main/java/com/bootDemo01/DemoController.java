package com.bootDemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Jehovah
 * Date: 2020-03-16
 * Time: 22:07
 */
@Controller
@EnableAutoConfiguration
public class DemoController {

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class,args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world!";
    }

}
