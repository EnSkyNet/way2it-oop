package homeworks.homework9.sum;

public class IncorrectNumberException extends RuntimeException {
    IncorrectNumberException() {
        System.out.println("You enter invalid number!");
    }
}