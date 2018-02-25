/**
 * Created by User on 22.01.2018.
 */
public class Main {

    public static void main(String[] args) {
        Pizza pizza=new BigPizza();
        pizza=new Chiken(pizza);
        pizza=new Salami(pizza);
        pizza.makePizza();
    }
}
