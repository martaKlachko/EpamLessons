package Entity;

import Entity.Customer;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

/**
 * Created by User on 20.01.2018.
 */
public class Order {
    private Customer customer;
    private LocalDateTime time;
    private Map<Product, Integer> products;
    private double sum;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.customer = customer;
        this.time = LocalDateTime.now();
        this.products = products;
        double sum = 0;
        for (Map.Entry entry : products.entrySet()) {
            Product product = (Product) entry.getKey();
            int quantity = (Integer) entry.getValue();
            sum += product.getPrice() * quantity;

        }
        this.sum = sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Order() {
    }

    public void add(Product product, int quantity) {
        products.put(product, quantity);
        sum += product.getPrice();
    }
}
