package com.cloud.albb.nacossentinel.nacossentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whh
 * @date 2020/11/20 16:56
 */
@RestController
@Slf4j
public class FlowLimitController {


    @GetMapping("/testA")
    public String testA() {
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----testB";
    }

}
