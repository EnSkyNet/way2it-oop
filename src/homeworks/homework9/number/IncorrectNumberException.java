package homeworks.homework9.number;

public class IncorrectNumberException extends RuntimeException {
    IncorrectNumberException() {
        System.out.println("You enter invalid number!");
    }
}
