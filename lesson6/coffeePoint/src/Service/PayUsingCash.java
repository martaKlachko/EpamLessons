package Service;

import Entity.Customer;

/**
 * Created by User on 20.01.2018.
 */
public class PayUsingCash implements PayService {
    @Override
    public void pay(Customer customer, double sum) {
        new PayUsingBonuses().pay(customer, sum);
        double addedBonuses = customer.getCard().addBonusesFromSum(sum);
        System.out.println("added bonuses: " + addedBonuses);
        System.out.println("Order was payed by cash. Balance now: " + customer.getCard().getBalance());

    }
}
