import java.util.ArrayList;
import java.util.List;

public class PetShop {
    public  List<Pet> availablePets = new ArrayList<>();
    public  List<Customer> customers = new ArrayList<>();
    public  List<Order> orders = new ArrayList<>();

    public void addPet(Pet pet){
        availablePets.add(pet);
    }
    public void addCustomer(Customer customer){

        customers.add(customer);
    }

    public void listAvailablePets(){
        for (Pet pet: availablePets){
            System.out.println(pet);
        }
    }

    public void placeOrder(Customer customer , Pet pet){
        Order order = new Order(customer,pet);
        orders.add(order);
        availablePets.remove(pet);
    }

    public void listOrder(){
        for (Order order: orders){
            System.out.println(order);
        }
    }
    
}
