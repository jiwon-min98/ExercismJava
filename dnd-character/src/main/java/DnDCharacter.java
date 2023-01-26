import java.util.Random;
import java.util.Arrays;

class DnDCharacter {
    private final Random random;

    private final int ability;
    private final int constitution;
    private final int strength;
    private final int dexterity;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

 
    public DnDCharacter() {
        random = new Random();

        ability = ability();
        constitution = ability();
        strength = ability();
        dexterity = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }

    int ability() {
        return random.ints(4, 1, 7).sorted().skip(1).sum();
    }

    int modifier(int input) {
        return Math.floorDiv(input -10, 2);
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
        return 10 + modifier(constitution);
    }

}
