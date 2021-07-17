package it.zoo.corsogabriele.core;

public class Umano extends Animale {

    private String nome;

    public Umano(String sesso, int eta, String nome) {
        super(sesso, eta);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String faiVerso() {
        return "bla bla bla";
    }

    @Override
    public String versoAllaNascita() {
        return "ueeee";
    }

}
