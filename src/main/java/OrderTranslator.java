public class OrderTranslator {

    private final static int MAX_SUGAR = 2;

    public static String translate(CustomerOrder order) {
        String translation = "";

        switch(order.getDrinkType()) {
            case CHOCOLATE:
                translation = "H:";
                break;

            case COFFEE:
                translation = "C:";
                break;

            case TEA:
                translation = "T:";
                break;
        }

        if(order.getSugarNb() > 0) {
            translation += order.getSugarNb() > MAX_SUGAR ? MAX_SUGAR : order.getSugarNb();
            translation += ":0";
        }

        else {
            translation += ":";
        }


        return translation;

    }

    public static String translate(String message) {
        return "M:" + message;
    }
}
