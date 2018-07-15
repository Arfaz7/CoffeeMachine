import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

public class OrderTranslatorTest {

    @Test
    public void translateChocolate() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "H::";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateCoffee() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.COFFEE);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "C::";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateTea() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.TEA);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "T::";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateChocolateWithNegativeSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, -1);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "H::";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateChocolateWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 1);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "H:1:0";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateCoffeeWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.COFFEE, 2);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "C:2:0";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateTeaWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.TEA, 2);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "T:2:0";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateTeaWithMaxSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.TEA, 5);

        String translatedOrder = OrderTranslator.translate(chocolate);
        String expected = "T:2:0";

        assertTrue(translatedOrder.equals(expected));
    }



    @Test
    public void translateMessage() {

        String translatedOrder = OrderTranslator.translate("No more Coffee");
        String expected = "M:No more Coffee";

        assertTrue(translatedOrder.equals(expected));
    }

}
