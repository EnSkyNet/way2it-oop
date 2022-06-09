package homeworks.homework15.accountList;

public class AccountListTest {
    public static void main(String[] args) {
        Account account11 = new Account(100);
        Account account12 = new Account(101);
        Person person1 = new Person("Taras");
        Account account21 = new Account(200);
        Account account22 = new Account(201);
        Person person2 = new Person("Igor");
        Account account31 = new Account(300);
        Account account32 = new Account(301);
        Person person3 = new Person("Nazar");

        AccountListService accountListService = new AccountListService();

        System.out.println("Add new persons with accounts");
        accountListService.addPerson(person1);
        accountListService.addPerson(person2);
        accountListService.addPerson(person3);
        accountListService.showPerson();
        System.out.println();

        System.out.println("Add new accounts for all persons");
        accountListService.addAccount("Taras", account11);
        accountListService.addAccount("Taras", account12);
        accountListService.addAccount("Igor", account21);
        accountListService.addAccount("Igor", account22);
        accountListService.addAccount("Nazar", account31);
        accountListService.addAccount("Nazar", account32);
        accountListService.showPerson();
        System.out.println();

        System.out.println("Remove 1-st account for person 3");
        accountListService.removeAccount("Nazar", account31);
        accountListService.showPerson();
        System.out.println();

        System.out.println("Add new account for person 3");
        Account account = new Account(3000);accountListService.addAccount("Nazar", account);
        accountListService.showPerson();
        System.out.println();

        System.out.println("Remove person 2");
        accountListService.removePerson("Igor");
        accountListService.showPerson();

    }
}
