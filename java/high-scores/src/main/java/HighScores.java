import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    // return the highest score from the list
    // return the last added score
    // return the three highest score
    private List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        Integer best = 0;
        for (Integer score : highScores) {
            if (best < score) {
                best = score;
            }
        }
        return best;
    }

    List<Integer> personalTopThree() {
        List<Integer> scores = new ArrayList<>(highScores);
        Collections.sort(scores);
        Collections.reverse(scores);
        return scores.subList(0, Math.min(scores.size(), 3));
    }

}
