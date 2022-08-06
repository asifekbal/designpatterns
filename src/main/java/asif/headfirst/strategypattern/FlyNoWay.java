package asif.headfirst.strategypattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck doesn't fly.");
    }
}
