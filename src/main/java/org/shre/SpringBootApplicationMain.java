package org.shre;

import org.shre.model.Laptop;
import org.shre.model.Programmer;
import org.shre.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class SpringBootApplicationMain{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootApplicationMain.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

//        Programmer obj = context.getBean(Programmer.class);
//        System.out.println(obj.getAge());
//        obj.coding();
    }
}
