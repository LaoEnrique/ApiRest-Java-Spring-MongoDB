package com.example.ApiRest;

import com.example.ApiRest.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDBApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDBApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		System.out.println("Data: " + customerRepository.findAll());
	}

}





