/**
 * Created by User on 22.01.2018.
 */
public class Salami extends PizzaDecorator {
    public Salami(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("salami wad added ");
    }
}

