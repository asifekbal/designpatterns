package asif.headfirst.strategypattern;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck doesn't quack.");
    }
}
