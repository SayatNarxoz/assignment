package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);

        System.out.print(car.getName());
        System.out.print(" "+car.getModel());
        System.out.print(" "+car.getYear());
    }
}