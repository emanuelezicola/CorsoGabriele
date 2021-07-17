package it.zoo.corsogabriele.core.leone;

import it.zoo.corsogabriele.core.Animale;

public class Leone extends Animale {

    public Leone(String sesso, int eta) {
        super(sesso, eta);
    }

    @Override
    public String faiVerso() {
        return "Roar";
    }

    @Override
    public String versoAllaNascita() {
        return "miniRoar";
    }
}
