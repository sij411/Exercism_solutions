import java.math.BigInteger;
import java.util.Map;

class ResistorColorTrio {
    private Map<String, Integer> mnemonics = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3,
            "yellow", 4, "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9
    );

    String label(String[] colors) {
        // two digits using method : value
        int first = mnemonics.get(colors[0]);
        int second = mnemonics.get(colors[1]);
        int exp = mnemonics.get(colors[2]);
        // calculate exponents with 10
        double exponents =  Math.pow(10, exp);
        // calculate total ohm
        // BigInteger ohm = new BigInteger(String.valueOf(first * 10 * exponents + second * exponents));

        Long ohm = (long) (first * 10 * exponents + second * exponents);
        String label = "ohms";

        if (ohm < Math.pow(10, 3)) {
            return ohm + " " + label;
        }
        else if (ohm < Math.pow(10, 6)) {

            return ohm/1000 + " " + "kilo" + label;
        }
        else if (ohm < Math.pow(10, 9)) {
            return ohm/1000000 + " " + "mega" + label;
        }
        else {
            return ohm/1000000000 + " " + "giga" + label;
        }


    }
}
