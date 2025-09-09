package com.example.spring_security_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SecurityBeans implements CommandLineRunner {

    private final ApplicationContext context;
    public SecurityBeans(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SecurityBeans started");
        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            if (beanName.toLowerCase().contains("security")) {
                System.out.println(beanName + " - > " + context.getBean(beanName).getClass().getName());
            }
        }
    }
}
