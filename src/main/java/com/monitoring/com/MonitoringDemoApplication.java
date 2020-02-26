package com.monitoring.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class MonitoringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringDemoApplication.class, args);
		System.out.println("!......Application start.....!!");
	}

}
