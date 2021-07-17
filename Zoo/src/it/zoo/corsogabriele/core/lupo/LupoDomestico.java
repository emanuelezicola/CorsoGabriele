package it.zoo.corsogabriele.core.lupo;

import it.zoo.corsogabriele.core.Umano;

public class LupoDomestico extends Lupo {

    private String nome;
    private Umano padrone;

    public LupoDomestico(String sesso, int eta, String nome, Umano padrone) {
        super(sesso, eta);
        this.nome = nome;
        this.padrone = padrone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Umano getPadrone() {
        return padrone;
    }

    public void setPadrone(Umano padrone) {
        this.padrone = padrone;
    }

}
