package homeworks.homework18.bank;

public interface UserService<Account, User> {
    DebitAccount debitAccount = null;
    CreditAccount creditAccount = null;

    void printAllAccount();

    void printAllUser();

    void printTax();
}