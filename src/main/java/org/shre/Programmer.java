package org.shre;

public class Alien {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    Programmer(){
        System.out.println("Object Created");
    }

    public void coding(){
        System.out.println("Coding");
    }
}
