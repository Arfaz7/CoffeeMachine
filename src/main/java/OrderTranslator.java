import java.util.HashMap;

public class OrderTranslator {

    private final static int MAX_SUGAR = 2;

    private HashMap<DrinkType, Double> prices;

    public static String order(final CustomerOrder order) {

        if(order.getMoney() >= order.getPrices().get(order.getDrinkType())) {
            return translate(order);
        }

        else {
            double difference = order.getPrices().get(order.getDrinkType()) - order.getMoney();
            return translate("Please insert " + difference + " euros");
        }
    }

    public static String translate(final CustomerOrder order) {
        String translation = "";


        switch(order.getDrinkType()) {
            case CHOCOLATE:
                translation = "H";
                break;

            case COFFEE:
                translation = "C";
                break;

            case TEA:
                translation = "T";
                break;

            case ORANGE_JUICE:
                translation = "O";
                break;
        }

        if(order.getDrinkType() != DrinkType.ORANGE_JUICE && order.isExtraHot()) {
            translation += "h";
        }

        translation += ":";

        if(order.getDrinkType() != DrinkType.ORANGE_JUICE && order.getSugarNb() > 0) {
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
