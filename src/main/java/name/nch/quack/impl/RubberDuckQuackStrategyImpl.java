package name.nch.quack.impl;

import name.nch.quack.QuackStrategy;

public class RubberDuckQuackStrategyImpl implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("Rubber Duck: Squeak!");
    }
}
