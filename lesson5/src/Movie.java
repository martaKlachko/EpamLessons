public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;
    private Price _price;

    public int get_priceCode() {
        return _price.getPriceCode();
    }

    public void set_priceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;

            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;

            case Movie.CHILDREN:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("wrong argument");
        }

    }

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);

    }

    public int getFrequentRenterPoints(int daysRented) {
         return _price.getFrequentRenterPoints(daysRented);

    }
}