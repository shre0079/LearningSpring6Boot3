package org.shre;

public class Programmer {

    Laptop lap;

    public Programmer(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
    }

//    public Programmer(int age){
//        System.out.println("Para Const Called!");
//        this.age=age;
//    }

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
        lap.compile();
    }
}
