public class CustomerOrder {

    private DrinkType drinkType;
    private int sugarNb;
    private double money;


    public CustomerOrder(DrinkType drinkType, int sugarNb, double money) {
        this.drinkType = drinkType;
        this.sugarNb = sugarNb;
        this.money = money;
    }

    public CustomerOrder(DrinkType drinkType, int sugarNb) {
        this(drinkType, sugarNb, 0);
    }

    public CustomerOrder(DrinkType drinkType) {

        this(drinkType, 0);
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarNb() {
        return sugarNb;
    }

    public void setSugarNb(int sugarNb) {
        this.sugarNb = sugarNb;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
