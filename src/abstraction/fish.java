package abstraction;

public class fish implements prey,predator{

    @Override
    public void hunt() {
        System.out.println("this fish is hunting smiler fish");
    }

    @Override
    public void flea() {
        System.out.println("this fish is big fish");

    }
}
