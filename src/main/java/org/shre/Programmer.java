package org.shre;

public class Programmer {

    private int age;
    private Computer Comp;

    public Programmer(){
        System.out.println("Programmer Object Created");
    }

//    public Programmer(Computer comp, int age) {
//          System.out.println("Para Const Called!");
//        this.Comp = Comp;
//        this.age = age;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return Comp;
    }

    public void setComp(Computer comp) {
        Comp = comp;
    }

    public void coding(){
        System.out.println("Coding");
        Comp.compile();
    }
}
