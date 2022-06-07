package homeworks.homework18.bank;

import java.util.Arrays;

public class BankTest {
    public static void main(String[] args) {
        User userOne = new User("Petro", 30);
        DebitAccount debitAccount = new DebitAccount("100", 1000);
        CreditAccount creditAccount = new CreditAccount(101, 1001);
        userOne.accountSetAdd(creditAccount);
        userOne.accountSetAdd(debitAccount);


        User userTwo = new User("Stepan", 40);
        DebitAccount debitAccount2 = new DebitAccount("200", 2000);
        CreditAccount creditAccount2 = new CreditAccount(201, 2001);
        userTwo.accountSetAdd(debitAccount2);
        userTwo.accountSetAdd(creditAccount2);

        User userThree = new User("Nazar", 50);
        DebitAccount debitAccount3 = new DebitAccount("300", 3000);
        CreditAccount creditAccount3 = new CreditAccount(301, 3001);
        userThree.accountSetAdd(debitAccount3);
        userThree.accountSetAdd(creditAccount3);

        UserServiceImpl userService = new UserServiceImpl();
        userService.userSetAdd(userOne);
        userService.userSetAdd(userTwo);
        userService.userSetAdd(userThree);

        System.out.println("Account list:");
        userService.printAllAccount();
        System.out.println();
        System.out.println("Users list:");
        userService.printAllUser();
        System.out.println();
        System.out.println("Taxes list:");
        userService.printTax();
    }
}
