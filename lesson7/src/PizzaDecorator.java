/**
 * Created by User on 22.01.2018.
 */
public abstract class PizzaDecorator implements Pizza {
    Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

   public void makePizza(){
        decoratedPizza.makePizza();
    }
}
