// Proxy class

import java.util.List;

public class OrderFulfillment implements IOrder{
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses){

        this.warehouses = warehouses;
    }
    public void fulfillOrder(Order order){

        for (Item item: order.itemList) {
            boolean itemFulfilled = false;
            for (Warehouse warehouse : warehouses) {
                if (warehouse.currentInventory(item) > 0) {
                    warehouse.fulfillOrder(new Order(List.of(item)));
                    itemFulfilled = true;
                    break;
                }
            }
            if (!itemFulfilled) {
                System.out.println("Item with SKU: " + item.item_name + " could not be fulfilled from any warehouse.");
            }
        }
    }
    
}