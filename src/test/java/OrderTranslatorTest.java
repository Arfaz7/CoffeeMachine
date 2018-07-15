import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

public class OrderTranslatorTest {

    @Test
    public void translateChocolate() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("H::"));
    }

    @Test
    public void translateCoffee() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.COFFEE);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("C::"));
    }

    @Test
    public void translateTea() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.TEA);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("T::"));
    }

    @Test
    public void translateChocolateWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 1);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("H:1:0"));
    }

    @Test
    public void translateCoffeeWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.COFFEE, 2);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("C:2:0"));
    }

    @Test
    public void translateTeaWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.TEA, 3);

        String translatedOrder = OrderTranslator.translate(chocolate);

        assertTrue(translatedOrder.equals("T:3:0"));
    }

}
