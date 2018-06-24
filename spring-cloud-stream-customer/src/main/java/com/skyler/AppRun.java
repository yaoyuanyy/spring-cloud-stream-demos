package com.skyler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此消费者需要启动多个
 *
 * 注意：我们试验的时候需要启动多个实例，可以通过运行参数来为不同实例设置不同的索引值
 * spring.cloud.stream.instanceIndex=0
 */
@SpringBootApplication
public class AppRun {

	public static void main(String[] args) {
		SpringApplication.run(AppRun.class, args);
	}
}
