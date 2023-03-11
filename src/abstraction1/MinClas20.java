package abstraction1;

public class MinClas20 {
    public static void main(String[] args) {
       Store store=new WareHouse();
       store.chips();

       WareHouse se=new WareHouse();
       se.chips();
       se.grocery();
       se.soda();
       se.water();
       se.raw();
    }
}
