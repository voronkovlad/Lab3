package ds;

public enum Race {
    HUMAN("Human"),
    ELF("Elf"),
    GNOME("Gnome"),
    ORC("Orc"),
    GREMLIN("Gremlin");


    private String value;
    
    Race(String newValue) {
        this.value = newValue;
    }

    public String value() {
        return value;
    }
}
