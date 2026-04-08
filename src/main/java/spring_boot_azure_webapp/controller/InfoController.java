package spring_boot_azure_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String getInfo() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();

        String hostname = ip.getHostName();
        String hostAddress = ip.getHostAddress();

        return "Hostname: " + hostname + " | IP: " + hostAddress;
    }
    @GetMapping("/vm-info")
    public String getVmInfo() {
        String hostName = System.getenv("HOST_NAME");
        String hostIp = System.getenv("HOST_IP");

        return "Guest OS Hostname: " + hostName +
                " | Guest OS IP: " + hostIp;
    }
}