public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public void describe(Character character) {
        System.out.print("You're a level " + character.getLevel() + " " + character.getCharacterClass() + " " + "with " + character.getHitPoints() + " hit points.");
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public void describe(Destination destination) {
        System.out.println("You've arrived at " + destination.getName() +", which has " + destination.getInhabitants() + " inhabitants.");
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character and Destination
}
