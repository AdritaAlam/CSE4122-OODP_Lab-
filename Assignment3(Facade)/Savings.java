public class Savings implements IAccount{
    //private  int accountNumber;
    private  int accountNumber;
    private int balance;

    public Savings(int accountNumber,int initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    @Override
    public int getAccountNumber(){
        return accountNumber;
    }
    
    // public int getBalance(){
    //     return balance;
    // }

    @Override
    public void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposited balance " + amount + " to Saving Accountno. " + accountNumber);
            System.out.println("Current balance in saving Account is : " + balance);
        } else {
            System.out.println("Invalid amount to deposit!");
        }
    }

    @Override
    public void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("balance " + amount + "  is Withdrawn  from Saving Accountno. " + accountNumber );
            System.out.println("Current balance in saving Account is : " + balance);
        }
        else{
            System.out.println("Insufficent balance!");
        }
    }

    @Override
    public void transfer(int amount,IAccount toAccount){
        if (balance >= amount && amount>=0){
            balance -= amount;
            //receiverAccount.deposit(amount);
            //withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transaction suucessful.");
            System.out.println("Transfered balance " + amount + " from Saving account " + accountNumber + " to Account" + toAccount.getAccountNumber());
            System.out.println("Current balance in saving Account is : " + balance);
        }
        else{
            System.out.println("Transaction failed: Insufficient balance!");
        }
    }




    
}