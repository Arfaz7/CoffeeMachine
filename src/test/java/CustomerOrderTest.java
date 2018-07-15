import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerOrderTest {


    @Test
    public void orderChocolate() {
        CustomerOrder chocolateWithoutSugar = new CustomerOrder(DrinkType.CHOCOLATE);

        assertEquals(DrinkType.CHOCOLATE, chocolateWithoutSugar.getDrinkType());
        assertEquals(0, chocolateWithoutSugar.getSugarNb());
    }

    @Test
    public void orderChocolateWithSugar() {
        CustomerOrder chocolateWithSugar = new CustomerOrder(DrinkType.CHOCOLATE, 2);

        assertEquals(DrinkType.CHOCOLATE, chocolateWithSugar.getDrinkType());
        assertEquals(2, chocolateWithSugar.getSugarNb());
    }

    @Test
    public void orderCoffee() {
        CustomerOrder coffeeWithoutSugar = new CustomerOrder(DrinkType.COFFEE);

        assertEquals(DrinkType.COFFEE, coffeeWithoutSugar.getDrinkType());
        assertEquals(0, coffeeWithoutSugar.getSugarNb());
    }

    @Test
    public void orderCoffeeWithSugar() {
        CustomerOrder coffeeWithSugar = new CustomerOrder(DrinkType.COFFEE, 2);

        assertEquals(DrinkType.COFFEE, coffeeWithSugar.getDrinkType());
        assertEquals(2, coffeeWithSugar.getSugarNb());
    }

    @Test
    public void orderTea() {
        CustomerOrder teaWithoutSugar = new CustomerOrder(DrinkType.TEA);

        assertEquals(DrinkType.TEA, teaWithoutSugar.getDrinkType());
        assertEquals(0, teaWithoutSugar.getSugarNb());
    }

    @Test
    public void orderTeaWithSugar() {
        CustomerOrder teaWithSugar = new CustomerOrder(DrinkType.TEA, 2);

        assertEquals(DrinkType.TEA, teaWithSugar.getDrinkType());
        assertEquals(2, teaWithSugar.getSugarNb());
    }

    @Test
    public void orderOrangeJuice(){
        CustomerOrder orangeJuice  = new CustomerOrder(DrinkType.ORANGE_JUICE);

        assertEquals(DrinkType.ORANGE_JUICE, orangeJuice.getDrinkType());
    }
}
