package Service;

import Entity.Customer;

/**
 * Created by User on 20.01.2018.
 */
public class PayUsingBonuses implements PayService {

    @Override
    public void pay(Customer customer, double sum) {
        double usedBonuses=0;
        if (customer.getCard().getBalance() >= sum) {
            usedBonuses=sum;
            customer.getCard().setBalance(customer.getCard().getBalance() - usedBonuses);//списання бонусів

        } else {
            usedBonuses=customer.getCard().getBalance();
            customer.getCard().setBalance(0);


        }

        System.out.println("Used bonuses: " + usedBonuses);

    }
}
