public interface AccountState {
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
    public void deposit(double depositAmount, Account account);
    public void withdraw(double withdrawAmount, Account account);
}
