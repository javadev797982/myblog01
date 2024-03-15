package com.myblog.myblog01;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//program execution starting point
public class Myblog01Application {

	public static void main(String[] args) {SpringApplication.run(Myblog01Application.class, args);
	}
//@Bean- used to inform spring ioc to create object// when Ioc do not know which object to create
//@Bean- used only inside only config file
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
