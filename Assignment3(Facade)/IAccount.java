public interface IAccount {
    public void deposit(int amount);
    public void withdraw(int amount);
    public void transfer(int amount, IAccount receiverAccount);
    public int getAccountNumber();


}