package Entity;

/**
 * Created by User on 20.01.2018.
 */
public enum Product {

    COFFEE(15), MILK(5.50), CREME(8), CHOCOLATE(4), HOTDOG(25), SANDWICH_CHICKEN(30), SANDWICH_CHEESE(28);

    Product(double price) {
        this.price = price;
    }

    private final double price;

    public double getPrice() {
        return price;
    }
}
