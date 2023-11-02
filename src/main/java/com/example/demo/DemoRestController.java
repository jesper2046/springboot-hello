package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoRestController {

    @RequestMapping("hello")
    String helloWorld() throws UnknownHostException {
        return "Hello! current time is: " + new java.util.Date() + " machine name is: " + InetAddress.getLocalHost().getHostName() + " [" + InetAddress.getLocalHost().getHostAddress() + "]";
    }
}
