package homeworks.homework15.accountList;

public class AccountTest {
    public static void main(String[] args) {
        Account account11 = new Account(100);
        Account account12 = new Account(101);
        Person person1 = new Person("Taras");
        Account account21 = new Account(200);
        Account account22 = new Account(200);
        Person person2 = new Person("Igor");
        Account account31 = new Account(300);
        Account account32 = new Account(300);
        Person person3 = new Person("Nazar");

        AccountService accountService = new AccountService();

        System.out.println("Add new persons with accounts");
        accountService.addPerson(person1);
        accountService.addPerson(person2);
        accountService.addPerson(person3);
        accountService.showPerson();
        System.out.println();
        System.out.println("Remove account for person 3");
        accountService.removeAccount("Nazar");
        accountService.showPerson();
        System.out.println();
        System.out.println("Add new account for person 3");
        Account account = new Account(1000);
        accountService.addAccount("Nazar", account11);


        accountService.addAccount("Nazar", account);
        accountService.showPerson();
        System.out.println();
        System.out.println("Remove person 2");
        accountService.removePerson("Igor");
        accountService.showPerson();

    }
}
