import Entity.BonusCard;
import Entity.Customer;
import Entity.Order;
import Entity.Product;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 20.01.2018.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer("Marta Klachko", new BonusCard(12, 34));
        Map<Product, Integer> products=new HashMap<>();
        products.put(Product.COFFEE,1);
        products.put(Product.CREME,1);
        products.put(Product.HOTDOG,6);
        customer.makeOrder(products, "cash");


    }
}
