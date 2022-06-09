package homeworks.homework18.bank;

public interface UserService<T extends Account, User> {

    void printAllAccount();

    void printAllUser();

    void printTax();
}