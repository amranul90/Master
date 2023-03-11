package encapsulation2;

public class Encapsulation {
    private String FistName;
    private String LastName;
    private String DateOffBirth;

    public String getFistName(){
        return FistName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getDateOffBirth(){
        return DateOffBirth;
    }
    public void setFistName  (String newName){
        FistName =newName;

    }
    public void setLastName(String newLastName){
        LastName=newLastName;

    }
    public void setDateOffBirth(String newDateOffBirth){
        DateOffBirth=newDateOffBirth;
    }
}
