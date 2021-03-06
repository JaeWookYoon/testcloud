package com.seekers.seekurity.iv.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

import intseekersseekurityivconfig.configserver.ConfigServerApplication;

@EnableZuulServer
@SpringBootApplication
public class ZuulServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
}
