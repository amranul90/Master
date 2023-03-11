package encapsulation5;

public class Execution1 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setAge(22);
        e.setName("mo");
        e.setRoll(4);
        System.out.println(" age " + e.getAge() + " name " + e.getName() + " roll" + e.getRoll());
    }
}
