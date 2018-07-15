public class OrderTranslator {


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
            translation += order.getSugarNb() + ":0";
        }

        else {
            translation += ":";
        }


        return translation;

    }
}
