package homeworks.homework18.bank;

public interface UserService<Account, User> {
    void printAllAccount(Account account);

    void printAllUser(User user);

    void printTax(Account account);
}