import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private int strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;

    Random random = new Random();

    DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> modify = new ArrayList<>(scores); // when you call the scores -> which is referenced type data,
        // so you should copy all data and save to modifiable list because java doesn't know scores itself is unmodifiable or not
        Collections.sort(modify);
        Collections.reverse(modify);
        int sum = 0;
        for (int i = 0; i < modify.size() - 1; i++) {
            sum += modify.get(i);
        }

        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> diceNumbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            diceNumbers.add(random.nextInt(1,6));
        }

        return diceNumbers;
    }

    int modifier(int input) {
        // hitpoints = 10 + constitution modifier
        // modifier = (constitution - 10) / 2 round down.
        // (3 - 10) / 2 -> -3.5 round down -> -4

        return Math.floorDiv((input - 10),2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
