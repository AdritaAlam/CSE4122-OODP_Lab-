public class Customer {
    public static void main(String[] args){
        BankService myBankService = new BankService();
        //int saving = myBankService.createNewAccount("saving",new BigDecimal(500.00));

        int mySaving = myBankService.createNewAccount("savings",500);
        int myInvestment = myBankService.createNewAccount("investment",900);
        int myChequing = myBankService.createNewAccount("chequing",1000);
        
        myBankService.transferMoney(mySaving,myInvestment,300);
        myBankService.transferMoney(mySaving,myChequing,700);

        myBankService.depositMoney(mySaving,1300);
        myBankService.withdrawMoney(mySaving,200);

        myBankService.transferMoney(mySaving,myChequing,200);
        myBankService.transferMoney(myChequing,myInvestment,1500);

    }
}