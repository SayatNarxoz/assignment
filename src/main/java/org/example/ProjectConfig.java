package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    @Primary
    Car car(){
        Car car = new Car();
        car.setName("BMW");
        car.setModel("Series 5");
        car.setYear(2024);
        return car;
    }
    @Bean
    Car carSecond(){
        Car car = new Car();
        car.setName("Mercedes");
        car.setModel("E");
        car.setYear(2023);
        return car;
    }
    @Bean
    Car carThird(){
        Car car = new Car();
        car.setName("Toyota");
        car.setModel("Camry");
        car.setYear(2018);
        return car;
    }
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Sayat");
        person.setCar(car());
        return person;
    }
}
