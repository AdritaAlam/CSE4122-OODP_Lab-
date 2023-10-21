// Real object class

import java.util.Hashtable;

public class Warehouse implements IOrder{
    Hashtable<String, Integer> stock;
    public String address;

    public Warehouse(){
        stock = new Hashtable<>();
    }

    public void fulfillOrder(Order order){
        for (Item item: order.itemList){
            String sku = item.item_name;
            if (stock.containsKey(sku) && stock.get(sku) > 0){
                stock.put(sku,stock.get(sku) - 1);
                System.out.println("Fulfilled order for SKU: " + sku + " from Warehouse: " + address);
            }
            else{
                System.out.println("Item with Sku: " + sku + " is out of stock in warehouse: " + address);
            }
        }
    }

    public int currentInventory(Item item){
        if (stock.containsKey(item.item_name))
            return stock.get(item.item_name);//.intValue();
        return 0;    
    }
}