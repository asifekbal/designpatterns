package asif.headfirst.strategypattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck quacks");
    }
}
