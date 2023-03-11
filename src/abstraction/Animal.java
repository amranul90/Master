package abstraction;

import abstraction1.Store;

public abstract class Animal  {
    int age;
    String name;

    public abstract void makeNoise();

    public void printName(){
        System.out.println("my name is " +name);
    }
}

