public class Account {
    private String accountNumber;
    private double balance;

    private AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void activate(){
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() {
        accountState.close(this);
    }

    public void deposit(double depositAmount) {
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(double depositAmount) {
        accountState.withdraw(depositAmount, this);
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}
