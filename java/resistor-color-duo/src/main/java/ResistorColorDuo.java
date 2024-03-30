import java.util.Map;

class ResistorColorDuo {
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
}
