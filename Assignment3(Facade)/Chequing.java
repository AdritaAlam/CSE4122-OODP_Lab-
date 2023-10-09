public class Chequing implements IAccount {
    //private  int accountNumber;
    private int accountNumber;
    private int balance;

    public Chequing(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    // public int getBalance(){
    //     return balance;
    // }

    @Override
    public void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposited balance " + amount + " to chequing Accountno. " + accountNumber);
            System.out.println("Current balance in chequing Account is : " + balance);
        } else {
            System.out.println("Invalid amount to deposit!");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("balance " + amount + "  is Withdrawn  from chequing Accountno. " + accountNumber);
            System.out.println("Current balance in chequing Account is : " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void transfer(int amount, IAccount receiverAccount) {
        if (balance >= amount && amount >= 0) {
            balance -= amount;
            //receiverAccount.deposit(amount);
            //withdraw(amount);
            receiverAccount.deposit(amount);
            System.out.println("Transaction successful.");
            System.out.println("Transferred balance " + amount + " from chequing account " + accountNumber + " to Account " + receiverAccount.getAccountNumber());
            System.out.println("Current balance in chequing Account is : " + balance);
        } else {
            System.out.println("Transaction failed: Insufficient balance!");
        }
    }
}

//    //@Override
//    public void transfer(IAccount receiverAccount, int amount) {
//        if (balance >= amount && amount >= 0) {
//            balance -= amount;
//            //receiverAccount.deposit(amount);
//            //withdraw(amount);
//            receiverAccount.deposit(amount);
//            System.out.println("Transaction successful.");
//            System.out.println("Transferred balance " + amount + " from chequing account " + accountNumber + " to Account" + receiverAccount);
//            System.out.println("Current balance in chequing Account is : " + balance);
//        } else {
//            System.out.println("Transaction failed: Insufficient balance!");
//        }
//    }





    
