package com.netec.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
 * @EnableFeignClients: Le indicamos a Spring 
 * que usaremos Feign en nuestro proyecto
*/

@EnableFeignClients
@SpringBootApplication
public class MicroCarritoFgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCarritoFgApplication.class, args);
	}

}
