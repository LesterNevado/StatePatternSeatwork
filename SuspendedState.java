public class SuspendedState implements AccountState{
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed");
    }
    public void deposit(double depositAmount, Account account) {
        System.out.println("Deposit is not allowed!");
    }
    public void withdraw(double withdrawAmount, Account acccount) {
        System.out.println("Withdraw is not allowed!");
    }
}
