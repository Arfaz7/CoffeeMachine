public class CustomerOrder {

    private DrinkType drinkType;
    private int sugarNb;


    public CustomerOrder(DrinkType drinkType, int sugarNb) {
        this.drinkType = drinkType;
        this.sugarNb = sugarNb;
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
}
