package asif.headfirst.strategypattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck flies with wings.");
    }
}
