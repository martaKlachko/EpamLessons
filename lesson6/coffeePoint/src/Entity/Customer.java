package Entity;

import Service.PayUsingCash;
import Service.PayUsingCreditCard;

import java.util.Map;

/**
 * Created by User on 20.01.2018.
 */
public class Customer {
    private String name;
    private BonusCard card;

    public Customer(String name, BonusCard card) {
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BonusCard getCard() {
        return card;
    }

    public void setCard(BonusCard card) {
        this.card = card;
    }



    public void pay(Order order, String paymentType) {
        if (paymentType.equalsIgnoreCase("cash")) {
            System.out.println("to pay: "+order.getSum());
            new PayUsingCash().pay(this, order.getSum());

        } else if (paymentType.equalsIgnoreCase("creditCard")) {
            System.out.println("to pay: "+order.getSum());
            new PayUsingCreditCard().pay(this, order.getSum());
        }else {
            System.out.println("wrong money type!");
        }


    }

    public void makeOrder(Map<Product, Integer> products, String paymentType) {
        System.out.println(this.getName());
        System.out.println(products);
        Order order = new Order(this, products);

        pay(order, paymentType);

    }
}
