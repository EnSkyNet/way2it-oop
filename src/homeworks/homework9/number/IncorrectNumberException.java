package homeworks.homework9.number;

public class IncorrectNumberException extends RuntimeException {
    IncorrectNumberException() {
        super("You enter invalid number!");
    }
}
