package name.nch.quack.impl;

import name.nch.quack.QuackStrategy;

public class MallardDuckQuackStrategyImpl implements QuackStrategy {

    @Override
    public void quack() {

        System.out.println("Mallard Duck: Quack!");
    }
}
