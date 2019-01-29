package name.nch;

import name.nch.duck.Duck;
import name.nch.quack.impl.MallardDuckQuackStrategyImpl;
import name.nch.quack.impl.RubberDuckQuackStrategyImpl;

public class Application {

    public static void main(String... args) {

        MallardDuckQuackStrategyImpl mallardDuckQuackStrategy = new MallardDuckQuackStrategyImpl();

        Duck mallardDuck = new Duck(mallardDuckQuackStrategy);

        RubberDuckQuackStrategyImpl rubberDuckQuackStrategy = new RubberDuckQuackStrategyImpl();

        Duck rubberDuck = new Duck(rubberDuckQuackStrategy);

        mallardDuck.quack();

        rubberDuck.quack();
    }
}
