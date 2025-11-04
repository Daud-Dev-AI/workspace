package com.skillstorm.hello_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.skillstorm.hello_spring_boot.beans.Vehicle;

@SpringBootApplication
public class HelloSpringBootApplication implements CommandLineRunner{


	@Autowired
	@Qualifier("camaro")
	private Vehicle car3;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);

		Vehicle car = (Vehicle) context.getBean("tesla");
		System.out.println("I am driving my tesla: ");
		car.drive();
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(car3);
		System.out.println("I'm driving my new camaro: ");
		car3.drive();
    }

}
