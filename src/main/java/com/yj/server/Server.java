package com.yj.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by Yao 2018/2/8 0008 10:31
 **/
@RestController
public class Server {

    @GetMapping("/server/get")
    public String get(){
        return "server2";
    }

}
