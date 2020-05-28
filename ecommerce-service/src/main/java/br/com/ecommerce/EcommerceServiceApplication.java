package br.com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.ecommerce.properties.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class EcommerceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceServiceApplication.class, args);
	}

}
