package org.shre;

import org.shre.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.crypto.spec.DESKeySpec;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop",Desktop.class);
        dt.compile();
        Desktop dt2 = context.getBean("desktop",Desktop.class);
        dt.compile();









//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Programmer obj = (Programmer) context.getBean("alien");
//        System.out.println(obj.getAge());
//        obj.coding();
    }
}
