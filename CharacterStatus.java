package ds;

public enum CharacterStatus {
    ALIVE(true),
    DEAD(false);


    private Boolean value;
    CharacterStatus(Boolean newValue) {
        this.value = newValue;
    }

    public Boolean value() {
        return value;
    }
}

