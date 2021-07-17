package it.zoo.corsogabriele.core.lupo;

import it.zoo.corsogabriele.core.Animale;

public class Lupo extends Animale {

    public Lupo(String sesso, int eta) {
        super(sesso, eta);
    }


    @Override
    public String faiVerso() {
        return "Auuuuu";
    }

    @Override
    public String versoAllaNascita() {
        return "miniAuuu";
    }
}
