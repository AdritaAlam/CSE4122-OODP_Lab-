public class OutOfStockState implements State{
    public void insertDollar(VendingMachine vendingMachine){
        System.out.println("Sorry,the machine is out of stock.Money returned");
        vendingMachine.ejectMoney();
    }
    public void ejectMoney(VendingMachine vendingMachine){
        System.out.println("No money to return.");
    }

    public void dispense(VendingMachine vendingMachine){
        System.out.println("The machine is out of stock. Cannot dispense.");
    }
}