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
    public void noMoneyInserted() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 0);

        String result = OrderTranslator.order(chocolate);
        String expected = "M:Please insert 0.5 euros";

        assertTrue(result.equals(expected));
    }

    @Test
    public void notEnoughMoneyInserted() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 0, 0.2);

        String result = OrderTranslator.order(chocolate);
        String expected = "M:Please insert 0.3 euros";

        assertTrue(result.equals(expected));
    }

    @Test
    public void tooMuchhMoneyInserted() {
        CustomerOrder chocolate = new CustomerOrder(DrinkType.CHOCOLATE, 0, 1.6);

        String result = OrderTranslator.order(chocolate);
        String expected = "H::";

        assertTrue(result.equals(expected));
    }

}
