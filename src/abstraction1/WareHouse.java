package abstraction1;

public class WareHouse extends Wholsale implements Store {


    public void water(){
        System.out.println(" we have water display");

    }

    @Override
    public void soda() {
        System.out.println("we sale soda");
    }

    @Override
    public void chips() {
        System.out.println("we sale chips");
    }

    @Override
    public void grocery() {

    }
}