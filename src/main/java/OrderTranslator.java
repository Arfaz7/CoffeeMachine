public class OrderTranslator {


    public static String translate(CustomerOrder order) {
        String translation = "";

        switch(order.getDrinkType()) {
            case CHOCOLATE:
                translation += "H";
                break;
        }

        return translation;

    }
}
