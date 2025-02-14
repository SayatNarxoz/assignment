package org.example;

import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    @Bean
    Car car(){
        Car car = new Car();
        car.setName("BMW");
        car.setModel("Series 5");
        car.setYear(2024);
        return car;
    }
}
