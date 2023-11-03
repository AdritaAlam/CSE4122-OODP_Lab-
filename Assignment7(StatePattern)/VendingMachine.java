public class VendingMachine{
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;

    private State currentState;
    private int count;

    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine(1);
        vendingMachine.insertDollar();
        vendingMachine.dispense();
    }


    public VendingMachine(int count){
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if (count > 0){
            currentState = idleState;
            this.count = count;
        }
        else{
            currentState = outOfStockState;
            this.count = 0;
        }
    }
    public void insertDollar(){
        currentState.insertDollar(this);
    }

    public void ejectMoney(){
        currentState.ejectMoney(this);
    }

    public void dispense(){
        currentState.dispense(this);
    }

    public int getCount(){
        return count;
    }

    public void doReturnMoney(){
        System.out.println("Returning Money");
    }
    public State getHasOneDollarState(){
        return hasOneDollarState;
    }
    public void doReleaseProduct(){
        System.out.println("Releasing product");
    }
    public State getOutOfStockState(){
        return outOfStockState;
    }

    public State getIdleState(){
        return idleState;
    }

    public void setState(State state){
        currentState = state;
    }


    
}