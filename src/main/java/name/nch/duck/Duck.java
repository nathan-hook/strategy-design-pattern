package name.nch.duck;

import name.nch.quack.QuackStrategy;

public class Duck {

    private QuackStrategy quackStrategy;

    public Duck(QuackStrategy quackStrategy) {

        this.quackStrategy = quackStrategy;
    }

    public void quack() {

        this.quackStrategy.quack();
    }
}
