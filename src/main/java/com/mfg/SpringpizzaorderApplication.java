package com.mfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mfg.model.Product;
import com.mfg.repository.CustomerRepository;
import com.mfg.repository.OrderRepository;
import com.mfg.repository.ProductRepository;

@SpringBootApplication
public class SpringpizzaorderApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringpizzaorderApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Product vegpizza = new Product();
		vegpizza.setProductName("Marrakech");
		vegpizza.setProductPrice(100.00);

		Product nonvegpizza = new Product();
		nonvegpizza.setProductName("Bacon");
		nonvegpizza.setProductPrice(200.00);

		productRepository.save(vegpizza);
		productRepository.save(nonvegpizza);

	}

}
