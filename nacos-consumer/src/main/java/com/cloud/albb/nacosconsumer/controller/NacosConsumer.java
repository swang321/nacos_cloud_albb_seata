package com.cloud.albb.nacosconsumer.controller;

import com.cloud.albb.nacosconsumer.client.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author whh
 * @date 2020/11/10 11:14
 */
@RestController
@RequiredArgsConstructor
public class NacosConsumer {

    private final RestTemplate restTemplate;

    private final Client client;

    @RequestMapping("/test/{name}")
    public String test(@PathVariable String name) {
        return restTemplate.getForObject("http://nacos-provider/test/" + name, String.class);
    }

    @RequestMapping("/test1/{name}")
    public String test1(@PathVariable String name) {
        return client.test(name);
    }

}
