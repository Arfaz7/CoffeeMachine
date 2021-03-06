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
        CustomerOrder coffee = new CustomerOrder(DrinkType.COFFEE);

        String translatedOrder = OrderTranslator.translate(coffee);
        String expected = "C::";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateTea() {
        CustomerOrder tea = new CustomerOrder(DrinkType.TEA);

        String translatedOrder = OrderTranslator.translate(tea);
        String expected = "T::";

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
        CustomerOrder coffee = new CustomerOrder(DrinkType.COFFEE, 2);

        String translatedOrder = OrderTranslator.translate(coffee);
        String expected = "C:2:0";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateTeaWithSugar() {
        CustomerOrder tea = new CustomerOrder(DrinkType.TEA, 2);

        String translatedOrder = OrderTranslator.translate(tea);
        String expected = "T:2:0";

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
    public void translateTeaWithTooMuchSugar() {
        CustomerOrder tea = new CustomerOrder(DrinkType.TEA, 5);

        String translatedOrder = OrderTranslator.translate(tea);
        String expected = "T:2:0";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateMessage() {

        String translatedOrder = OrderTranslator.translate("No more Coffee");
        String expected = "M:No more Coffee";

        assertTrue(translatedOrder.equals(expected));
    }

    @Test
    public void translateOrangeJuice() {
        CustomerOrder orangeJuice = new CustomerOrder(DrinkType.ORANGE_JUICE);

        String result = OrderTranslator.translate(orangeJuice);
        String expected = "O::";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateOrangeJuiceWithSugar() {
        CustomerOrder orangeJuice = new CustomerOrder(DrinkType.ORANGE_JUICE, 2);

        String result = OrderTranslator.translate(orangeJuice);
        String expected = "O::";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotChocolate() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 0, 2.3, true);

        String result = OrderTranslator.translate(chocolate);
        String expected = "Hh::";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotChocolateWithSugar() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 2, 2.3, true);

        String result = OrderTranslator.translate(chocolate);
        String expected = "Hh:2:0";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotCoffee() {
        CustomerOrder coffee = new CustomerOrder(DrinkType.COFFEE, 0, 2.3, true);

        String result = OrderTranslator.translate(coffee);
        String expected = "Ch::";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotCoffeeWithSugar() {
        CustomerOrder coffee = new CustomerOrder(DrinkType.COFFEE, 2, 2.3, true);

        String result = OrderTranslator.translate(coffee);
        String expected = "Ch:2:0";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotTea() {
        CustomerOrder tea = new CustomerOrder(DrinkType.TEA, 0, 2.3, true);

        String result = OrderTranslator.translate(tea);
        String expected = "Th::";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotTeaWithSugar() {
        CustomerOrder tea = new CustomerOrder(DrinkType.TEA, 2, 2.3, true);

        String result = OrderTranslator.translate(tea);
        String expected = "Th:2:0";

        assertTrue(result.equals(expected));
    }

    @Test
    public void translateExtraHotOrangeJuice() {
        CustomerOrder orangeJuice = new CustomerOrder(DrinkType.ORANGE_JUICE, 0, 2.3, true);

        String result = OrderTranslator.translate(orangeJuice);
        String expected = "O::";

        assertTrue(result.equals(expected));
    }

}
