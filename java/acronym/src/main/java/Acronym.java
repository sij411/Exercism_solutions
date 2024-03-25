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
        phrase = phrase.replaceAll("[^A-Za-z0-9]", " ");
        String[] space = phrase.split(" ");



        return Arrays.toString(space);
    }

}
