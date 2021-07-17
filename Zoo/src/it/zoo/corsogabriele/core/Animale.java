package it.zoo.corsogabriele.core;

public abstract class Animale implements EssereVivente {

    private String sesso;
    private int eta;

    protected Animale(String sesso, int eta) {
        this.sesso = sesso;
        this.eta = eta;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

}
