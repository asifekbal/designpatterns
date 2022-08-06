package asif.headfirst.strategypattern;

public class MiniDuckSimilutaor {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
    }
}
