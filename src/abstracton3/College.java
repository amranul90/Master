package abstracton3;

public abstract class College implements University{
    public abstract void Associate();


    public void master(){
        System.out.println(" im going to college for my master");
    }


    @Override
    public void bachelor() {
        System.out.println("im going to university for my bechelor");
    }

    @Override
    public void Arts() {
        System.out.println("im going to get my arts");
    }
}
