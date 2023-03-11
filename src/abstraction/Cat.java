package abstraction;

public  class Cat implements predator {

    public void makeNoise() {
        System.out.println("mewo");

    }

    @Override
    public void hunt() {
        System.out.println("hi lac hunt");
    }
}
