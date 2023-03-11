package encapsulation6;

public class Mobile {
    private String name;
    private int number;
    private int id;
     public String getName(){
         return name;
     }
     public int getNumber(){
         return number;

     }
     public int getId(){
         return id;
     }
     public void setName(String newName){
         name =newName;
     }
     public void setNumber(int newNumber){
         number=newNumber;
     }
     public void setId(int newID){
         id=newID;
     }
}
