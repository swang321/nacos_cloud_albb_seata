package com.cloud.albb.nacosconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author whh
 * @date 2020/11/10 16:10
 */
@FeignClient("nacos-provider")
public interface Client {

    @RequestMapping("test/{name}")
    String test(@PathVariable(name = "name") String name);

}
