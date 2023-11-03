// The IdleState class now implements the State interface. When
// a dollar is inserted, the insertDollar() method is called, which
// then calls a setState() method upon the vendingMachine
// object. This changes the current state of the machine to the
// HasOneDollar state.



public class IdleState implements State{
    public void insertDollar(VendingMachine vendingMachine){
        System.out.println("Dollar inserted! ");

        vendingMachine.setState(
            vendingMachine.getHasOneDollarState()
        );
    }

    public void ejectMoney(VendingMachine vendingMachine){
        System.out.println("No money to return! ");
    }

    public void dispense(VendingMachine vendingMachine){
        System.out.println("Payment required! ");
    }
    
}