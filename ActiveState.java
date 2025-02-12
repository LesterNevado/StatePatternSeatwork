public class ActiveState implements AccountState{
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
    public void deposit(double depositAmount, Account account) {
        account.setBalance(depositAmount);
        System.out.println("Deposit successful!\n" + account.toString());
    }
    public void withdraw(double withdrawAmount, Account account) {
        account.setBalance(account.getBalance()-withdrawAmount);
        System.out.println("Withdraw successful!\n" + account.toString());
    }
}
