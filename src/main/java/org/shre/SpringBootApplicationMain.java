package org.shre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class SpringBootApplicationMain{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootApplicationMain.class, args);

        Programmer obj = context.getBean(Programmer.class);
        obj.coding();
    }
}
