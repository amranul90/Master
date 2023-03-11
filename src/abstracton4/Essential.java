package abstracton4;

public abstract class Essential implements Mentos{

    public abstract void core();

    public void mixedfruit(){
        System.out.println("from mentos gum1");
    }


    @Override
    public void fruit() {
        System.out.println("from mentos");
    }

    @Override
    public void chewfresh() {
        System.out.println(" chew fresh best ");

    }
}
