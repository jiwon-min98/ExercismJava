abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }
    public String toString() {
        return "Fighter is a Wizard";
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) return 10;
        else return 6;
    }
}

class Wizard extends Fighter {
    private boolean spell = false;

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spell == true) return 12;
        else return 3;
    }

    void prepareSpell() {
        spell = true;
    }

}
