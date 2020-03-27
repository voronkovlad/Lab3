package ds;

public enum Weapon {
    SWORD(2),
    NOTHING(0),
    BOW(1),
    DAGGER(3),
    STAFF(2),
    AXE(2.5);


    private double value;

    Weapon(double newValue) {
        this.value = newValue;
    }


    public double value() {
        return value;
    }
}