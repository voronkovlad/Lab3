package ds;

public enum HeroClass {
    MAGE("Mage"),
    WARRIOR("Warrior"),
    PRIEST("Priest"),
    PALADIN("Paladin"),
    FIGHTER("Fighter");

    private String value;
    
    HeroClass(String newValue) {
        this.value = newValue;
    }

    public String value() {
        return value;
    }
}

