package it.zoo.corsogabriele.core;

public class LeoneDomestico extends Leone {

    private String nome;

    public LeoneDomestico(String sesso, int eta, String nome) {
        super(sesso, eta);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
