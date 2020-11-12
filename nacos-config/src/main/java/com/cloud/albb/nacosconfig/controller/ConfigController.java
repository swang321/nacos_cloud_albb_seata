package com.cloud.albb.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whh
 * @date 2020/11/10 16:38
 */
@RefreshScope
@RestController
public class ConfigController {


    @Value("${title}")
    public String title;

    @RequestMapping("test")
    public String test() {
        return title;
    }
}
