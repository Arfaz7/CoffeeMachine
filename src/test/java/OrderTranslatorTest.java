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

}
