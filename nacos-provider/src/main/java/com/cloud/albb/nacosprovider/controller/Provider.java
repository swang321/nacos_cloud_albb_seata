package com.cloud.albb.nacosprovider.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whh
 * @date 2020/11/10 10:57
 */
@RestController
public class Provider {

    @RequestMapping("test/{name}")
    public String test(@PathVariable String name) {
        return "hello nocas discorty" + name;
    }

}
