package homeworks.homework18.bank;

public class BankTest {
    public static void main(String[] args) {
        Account debitAccount = new Account("100", 1000);
        Account creditAccount = new Account(200, 2000);
        User user = new User("Petro", 30);
        user.setAccount(debitAccount);

        UserServiceImpl userService = new UserServiceImpl();
        userService.printAllAccount(debitAccount);
    }
}
