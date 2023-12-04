package main.java.com.vitaly.footask;

/*
04-Dec-23
gh /crazym8nd
*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread threadA = new Thread(() -> foo.first());
        Thread threadB = new Thread(() -> foo.second());
        Thread threadC = new Thread(() -> foo.third());
        threadA.start();
        threadC.start();
        threadB.start();


        threadC.join();
        threadA.join();
        threadB.join();


    }
}

