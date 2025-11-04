package com.skillstorm.hello_spring_boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.skillstorm.hello_spring_boot.beans.Car;
import com.skillstorm.hello_spring_boot.beans.ElectricEngine;
import com.skillstorm.hello_spring_boot.beans.Engine;
import com.skillstorm.hello_spring_boot.beans.GasEngine;
import com.skillstorm.hello_spring_boot.beans.Vehicle;

@Configuration
public class CarConfiguration {



    @Bean(name = {"mustang", "camaro"})
    @Scope("prototype")
    public Vehicle gasCar(){
        Car car = new Car();
        car.setEngine(GasEngine());
        return car;
    }
    @Bean(name = "tesla")
    @Scope("singleton")
    public Vehicle electricCar(){
        Car car = new Car(electricEngine());
        return car;
    }

    @Bean
    public Engine GasEngine(){
        return new GasEngine();
    }
    @Bean
    public Engine electricEngine(){
        return new ElectricEngine();
    }
}
