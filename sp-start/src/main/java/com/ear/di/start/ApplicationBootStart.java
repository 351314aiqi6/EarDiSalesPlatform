package com.ear.di.start;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.dao.IppEMandateEventMapper;
import com.ear.di.service.ControllerTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ear.di")
@MapperScan("com.ear.di.dao")
public class ApplicationBootStart {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootStart.class, args);
		System.out.println(SpringUtil.getBean(ControllerTest.class));

	}
}


