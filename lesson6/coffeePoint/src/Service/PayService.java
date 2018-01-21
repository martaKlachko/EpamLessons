package Service;

import Entity.Customer;

/**
 * Created by User on 20.01.2018.
 */
public interface PayService {
    void pay(Customer customer, double sum);
}
