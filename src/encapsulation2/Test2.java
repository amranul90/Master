package encapsulation2;

public class Test2 {
    public static void main(String[] args) {
        Lotto k=new Lotto();
       k.setName("mike");
       k.setAge(31);
       k.setIdNum("ms1234");
        System.out.println("name :" +k.getName() + " age : " + k.getAge());
        System.out.println(" idNum : " + k.getIdNum());

        Encapsulation e=new Encapsulation();
        e.setFistName("sidrt");
        e.setLastName("km");
        e.setDateOffBirth("jan 19");
        System.out.println(" FistName " + e.getFistName() + " LastName " + e.getLastName() + " date off birth " + e.getDateOffBirth());
    }
}
