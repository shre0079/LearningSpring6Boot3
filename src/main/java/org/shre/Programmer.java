package org.shre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired
    Laptop laptop;

    public void coding(){
        System.out.println("Coding");
    }
}
