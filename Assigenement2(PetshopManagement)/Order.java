public class Order {
    private Customer customer;
    private Pet pet;

    public Order(Customer customer, Pet pet){
        this.customer = customer;
        this.pet = pet;
    }

    @Override
    public String toString(){

        return "Customer: " + customer.getName() + "\nOrdered pet: " + pet;
    }

}
