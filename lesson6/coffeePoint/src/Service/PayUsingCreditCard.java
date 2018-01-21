package Service;

import Entity.Customer;

/**
 * Created by User on 20.01.2018.
 */
public class PayUsingCreditCard implements PayService {
    @Override
    public void pay(Customer customer, double sum) {
        new PayUsingBonuses().pay(customer, sum);
        double addedBonuses = customer.getCard().addBonusesFromSum(sum);
        addedBonuses += customer.getCard().addExtraBonuses(2);//додаткові бонуси за викристання кредитки
        System.out.println("added bonuses: " + addedBonuses);
        System.out.println("Order was payed by credit card. Balance now: " + customer.getCard().getBalance());

    }
}
