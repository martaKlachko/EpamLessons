package Entity;

/**
 * Created by User on 20.01.2018.
 */
public class BonusCard {
    private int ID;
    private double balance;

    public BonusCard(int ID, double balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BonusCard)) return false;

        BonusCard bonusCard = (BonusCard) o;

        if (getID() != bonusCard.getID()) return false;
        return Double.compare(bonusCard.getBalance(), getBalance()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getID();
        temp = Double.doubleToLongBits(getBalance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double addBonusesFromSum(double sum){

        balance+=(sum*0.05); //додавання 5 відсотків від покупки
        return sum*0.05;

    }
    public double addExtraBonuses(double sum){

        balance+=sum;
        return sum;

    }
}
