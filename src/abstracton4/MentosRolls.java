package abstracton4;

public class MentosRolls extends Essential{

    public void item(){
        System.out.println("item");
    }

    @Override
    public void core() {
        System.out.println("core");
    }

    @Override
    public void fruit() {
        System.out.println("fruit");
    }

    @Override
    public void chewfresh() {
        System.out.println("chewfresh");
    }
}
