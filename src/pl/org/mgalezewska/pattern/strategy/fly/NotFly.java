package pl.org.mgalezewska.pattern.strategy.fly;

import pl.org.mgalezewska.pattern.strategy.fly.FlyInterface;

/**
 * User: mgalezewska
 * Date: 2015-02-01
 */
public class NotFly implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("This duck can't fly");
    }
}
