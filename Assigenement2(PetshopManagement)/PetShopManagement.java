import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetShopManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop petshop = new PetShop();

        System.out.println("------Welcome to our PetShop management system------");
        System.out.println("Enter you choice: ");
        System.out.println("1: Add pet");
        System.out.println("2: List of Available pets");
        System.out.println("3: Add customer");
        System.out.println("4: Place an order");
        System.out.println("5: List of ordered pets");
        System.out.println("6: Exit");

        while(true){
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                System.out.println("Enter pet name: ");
                String petName = sc.nextLine();
                System.out.println("Enter pet species:  ");
                String species = sc.nextLine();
                System.out.println("Enter pet age:  ");
                int age = sc.nextInt();
                System.out.println("Enter pet price:  ");
                double price = sc.nextDouble();

                Pet newPet = new Pet(petName,species,age,price);
                petshop.addPet(newPet);

            }
            else if (choice == 2){
                petshop.listAvailablePets();

            }
            else if (choice == 3){
                System.out.println("Enter customer name: ");
                String customerName = sc.nextLine();
                Customer customer = new Customer(customerName);
                petshop.addCustomer(customer);
            }
            else if (choice == 4){
                if (petshop.customers.isEmpty() || petshop.availablePets.isEmpty()){
                    System.out.println("Please add a customer and a pet first");
                    //continue;
                    break;

                }
                System.out.println("Select a customer: ");
                for (int i = 0; i<petshop.customers.size(); i++){
                    System.out.println((i+1) + ". " + petshop.customers.get(i).getName());

                }

                int customerChoice = sc.nextInt();
                sc.nextLine();

                if (customerChoice<1 || customerChoice > petshop.customers.size()){
                    System.out.println("Invalid customer choice");
                    continue;
                }
                Customer selectedCustomer = petshop.customers.get(customerChoice-1);

                System.out.println("Select a pet: ");
                for (int i=0;i<petshop.availablePets.size();i++){
                    System.out.println((i+1) + ". " + petshop.availablePets.get(i).getName());

                }
                int petChoice = sc.nextInt();
                sc.nextLine();

                if (petChoice<1 || petChoice> petshop.availablePets.size()){
                    System.out.println("Invalid pet choice");
                    continue;
                }
                Pet selectedPet = petshop.availablePets.get(petChoice-1);
                petshop.placeOrder(selectedCustomer,selectedPet);
            }

            else if (choice == 5){
                petshop.listOrder();
            }
            else if (choice == 6){
                System.out.println("Existing pet shop. ");
                sc.close();
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice.Please try again.");

            }

        }

    }


    
}