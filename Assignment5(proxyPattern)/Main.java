import java.util.Hashtable;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Warehouse warehouse1 = new Warehouse();
        warehouse1.address = "Warehouse 1";

        Warehouse warehouse2 = new Warehouse();
        warehouse2.address = "Warehouse 2";

        warehouse1.stock.put("SKU001",1);
        warehouse2.stock.put("SKU002",2);

        List<Warehouse> warehouses = List.of(warehouse1,warehouse2);

        OrderFulfillment orderFulfillment = new OrderFulfillment(warehouses);

        List<Item> items = List.of(new Item("SKU001"),new Item("SKU002"),new Item("SKU003"));

        Order order = new Order(items);

        orderFulfillment.fulfillOrder(order);

    }
}