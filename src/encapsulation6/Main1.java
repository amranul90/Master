package encapsulation6;

public class Main1 {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.setName("handry");
        m.setNumber(120);
        m.setId(101);
        System.out.println( " name " + m.getName() + " number " +m.getNumber() + " id " + m.getId());
    }
}
