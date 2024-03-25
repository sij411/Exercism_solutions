import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Acronym {

    private String phrase;


    Acronym(String phrase) {
        this.phrase = tla(phrase);
    }

    String get() {
        return phrase;
    }

    String tla(String phrase) {
        phrase = phrase.replace("-", " ").replace("_", " ");
        System.out.println(phrase);
        String[] space = phrase.split(" ");

        String tla = "";

        for (String word : space) {
            if (word.isEmpty())
                continue;
            tla += word.charAt(0);

        }


        return tla.toUpperCase();
    }

}
