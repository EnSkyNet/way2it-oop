package homeworks.homework18.bank;

public class UserServiceImpl implements UserService<Account,User> {
    //final Account<Integer> account = new Account<>(200, 2000);


    @Override
    public void printAllAccount(Account account) {
        System.out.println("account = " + account.getId());
    }

    @Override
    public void printAllUser(User user) {
        System.out.println("user = " + user.getName());
    }

    @Override
    public void printTax(Account account) {
        System.out.println("tax 5%: " + (account.getSum()*0.05));
    }
}
