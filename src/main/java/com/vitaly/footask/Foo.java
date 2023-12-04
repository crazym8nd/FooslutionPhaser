package main.java.com.vitaly.footask;

import java.util.concurrent.Phaser;

/*
28-Nov-23
gh /crazym8nd
*/
public class Foo {
    Phaser phaser = new Phaser(3);

    public void first() {
        System.out.print("first");
        phaser.arriveAndAwaitAdvance();
    }

    public void second() {
        System.out.print("second");
        phaser.arriveAndAwaitAdvance();
    }

    public void third() {
        System.out.print("third");
        phaser.arriveAndAwaitAdvance();

    }
}
