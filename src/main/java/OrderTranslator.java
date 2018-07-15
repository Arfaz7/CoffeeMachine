public class OrderTranslator {


    public static String translate(CustomerOrder order) {
        String translation = "";

        switch(order.getDrinkType()) {
            case CHOCOLATE:
                translation = "H";
                break;

            case COFFEE:
                translation = "C";
                break;
        }

        return translation;

    }
}
