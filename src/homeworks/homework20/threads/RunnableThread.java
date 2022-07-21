package homeworks.homework20.threads;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    int num;

    public RunnableThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            printReversedFib(num);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static int f(int number) {
        if (number <= 1)
            return number;
        else
            return f(number - 1) + f(number - 2);
    }

    public static void printReversedFib(int x) throws InterruptedException {
        Thread.sleep(1000);
        if (x <= 1)
            System.out.print(f(x));
        else {
            System.out.print(f(x) + " ");
            printReversedFib(x - 1);
        }
    }
}
