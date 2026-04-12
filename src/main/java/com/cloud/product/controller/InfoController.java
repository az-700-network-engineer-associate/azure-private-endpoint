package com.cloud.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController("/products/vm")
public class InfoController {
    @GetMapping("/info")
    public Map<String,String> getVmInfo() {
        String hostName = System.getenv("HOST_NAME");
        String hostIp = System.getenv("HOST_IP");
        return Map.of(
                "Hostname", hostName != null ? hostName : "Unknown",
                "Host-IP", hostIp != null ? hostIp : "Unknown"
        );
    }
}