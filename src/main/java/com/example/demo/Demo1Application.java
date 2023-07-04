package com.example.demo;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.exception.NacosException;
import com.example.demo.utils.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) throws NacosException {
        SpringApplication.run(Demo1Application.class, args);
        NacosConfigManager bean = SpringUtils.getBean(NacosConfigManager.class);
        String default_group = bean.getConfigService().getConfig("demo1.yml", "DEFAULT_GROUP", 3000);
        System.out.println(default_group);
    }



}
