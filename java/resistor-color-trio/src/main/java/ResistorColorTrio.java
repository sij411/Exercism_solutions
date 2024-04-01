import java.math.BigInteger;
import java.util.Map;

class ResistorColorTrio {
    private Map<String, Integer> mnemonics = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3,
            "yellow", 4, "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9
    );

    int value(String[] colors) {
        String ans = "";
        for (int i = 0; i < 2; i++){
            String color = colors[i];
            ans += Integer.toString(mnemonics.get(color));
        }
        return Integer.parseInt(ans);
    }
    String label(String[] colors) {
        // two digits using method : value
        int first = mnemonics.get(colors[0]);
        int second = mnemonics.get(colors[1]);
        int exp = mnemonics.get(colors[2]);
        // calculate exponents with 10
        int exponents = (int) Math.pow(10, exp);
        // calculate total ohm
        int ohm = first * exponents + second * exponents;

        // labeling follows metric prefix
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
