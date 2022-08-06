package asif.headfirst.strategypattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck squeaks.");
    }
}
