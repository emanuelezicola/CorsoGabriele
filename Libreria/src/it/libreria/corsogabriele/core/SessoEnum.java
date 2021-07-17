package it.libreria.corsogabriele.core;

public enum SessoEnum {
    MASCHILE("Maschile"),
    FEMMINILE("Femminile");

    private final String value;

    public String getValue() {
        return this.value;
    }

    SessoEnum(String value) {
        this.value = value;
    }
}

