package com.cibertec.discoveryservergrupo09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerGrupo09Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo09Application.class, args);
    }

}
