package lab2.ex2;

public class MobileComputer extends Computer implements Chargeble{
    protected int battery;
    public MobileComputer() {
        sercet = "computer sercet";
        battery = 5;
    }
    @Override
    public void work() {
        if (battery > 0){
            System.out.println("It is working on my lap");
            battery--;
        } else
            System.out.println("Running out of battery");
    }
    public void charge() {
        if (battery < 10)
            battery++;
    }
}