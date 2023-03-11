package abstraction;

public class ExClass {
    public static void main(String[] args) {
        fish fish=new fish();
        fish.flea();
        fish.hunt();

        Cat cat=new Cat();
        cat.makeNoise();
        cat.hunt();
    }
}
