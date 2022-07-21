package homeworks.homework20.threads;

import java.util.Scanner;

public class TreadsTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter number of Fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        MyTreads myTreads = new MyTreads(number);
        RunnableThread run = new RunnableThread(number);
        myTreads.start();
        myTreads.join();
        run.run();
    }
}
