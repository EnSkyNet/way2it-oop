package homeworks.homework20.threads;

import java.util.Scanner;

public class MyTreads extends Thread {
    int num;
    public MyTreads(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            numbersFibonacci(num);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println();
    }

    private void numbersFibonacci(int numbers) throws InterruptedException {
        int n0 = 1;
        int n1 = 1;
        int n2;
        Thread.sleep(1000);
        System.out.print(n0 + " ");
        Thread.sleep(1000);
        System.out.print(n1 + " ");
        for (int i = 3; i <= numbers; i++) {
            Thread.sleep(1000);
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
