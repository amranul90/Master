package encapsulation1;

public class TestEncapsulation {
    public static void main(String[] args) {
        Account acc = new  Account();
        acc.setAcc_no(1234568l);
        acc.setName("amran");
        acc.setEmail("hm@gmail.com");
        acc.setAmount(500f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+ acc.getEmail()+" "+acc.getAmount());
    }
}
