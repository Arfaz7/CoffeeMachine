import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MoneyOrderTranslator {

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

    @Test
    public void notEnoughMoneyOrangeJuice() {
        CustomerOrder orangeJuice = new CustomerOrder(DrinkType.ORANGE_JUICE, 0, 0.3);

        String result = OrderTranslator.order(orangeJuice);
        String expected = "M:Please insert 0.3 euros";

        assertTrue(result.equals(expected));
    }

    @Test
    public void tooMuchMoneyOrangeJuice() {
        CustomerOrder orangeJuice = new CustomerOrder(DrinkType.ORANGE_JUICE, 0, 2.3);

        String result = OrderTranslator.order(orangeJuice);
        String expected = "O::";

        assertTrue(result.equals(expected));
    }
}
