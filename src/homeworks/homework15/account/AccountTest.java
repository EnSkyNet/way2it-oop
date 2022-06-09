package homeworks.homework15.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(100);
        Person person1 = new Person("Taras");
        Account account2 = new Account(200);
        Person person2 = new Person("Igor");
        Account account3 = new Account(300);
        Person person3 = new Person("Nazar");

        AccountService accountService = new AccountService();

        System.out.println("Add new persons with accounts");
        accountService.addPerson(person1, account1);
        accountService.addPerson(person2, account2);
        accountService.addPerson(person3, account3);
        accountService.showPerson();
        System.out.println();
        System.out.println("Remove account for person 3");
        accountService.removeAccount("Nazar");
        accountService.showPerson();
        System.out.println();
        System.out.println("Add new account for person 3");
        Account account = new Account(1000);
        accountService.addAccount("Nazar", account);
        accountService.showPerson();
        System.out.println();
        System.out.println("Remove person 2");
        accountService.removePerson("Igor");
        accountService.showPerson();

    }
}
