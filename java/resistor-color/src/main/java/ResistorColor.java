import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ResistorColor {

    private Map<String, Integer> mnemonics = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3,
            "yellow", 4, "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9
    );

    int colorCode(String color) {
        return mnemonics.get(color);

    }

    String[] colors() {
        String[] colors = new String[mnemonics.size()];
       for (String color : mnemonics.keySet()){
           int idx = mnemonics.get(color);
           colors[idx] = color;

       }

return colors;
    }
}
