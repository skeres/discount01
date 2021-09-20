package com.sks.discount01;

import com.sks.discount01.interfaces.ComponentRepository;
import com.sks.discount01.interfaces.ProductRepository;
import com.sks.discount01.model.Component;
import com.sks.discount01.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Discount01Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Discount01Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		productRepository.save(new Product("Lactel 1 litre", 1.20,1, "product_milk"));
		productRepository.save(new Product("Blue pen",2.0,2, "product_pen"));
		productRepository.save(new Product("Google phone",450.0,3, "product_phone"));
		productRepository.save(new Product("Fresh potatoes / pound",0.5,4, "product_potatoes"));
		productRepository.save(new Product("cucumber / unit",0.5,5,"product_cucumber"));
		productRepository.save(new Product("glass / unit",3.0,6, "product_glass"));

	}
}
