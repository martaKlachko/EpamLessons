/**
 * Created by User on 22.01.2018.
 */
public class Chiken extends PizzaDecorator {
    public Chiken(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("chicken wad added ");
    }
}
