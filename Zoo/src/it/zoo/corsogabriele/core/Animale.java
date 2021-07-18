package it.zoo.corsogabriele.core;

import java.util.Objects;

public abstract class Animale implements EssereVivente, Comparable<Animale> {

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

    /*
        Il metodo compareTo, dichiarato dall'Interfaccia Comparable<Animale> serve per avere un ordinamento dichiarato dal programmatore.
        Nel nostro caso, si prende in input un Animale e si controlla la loro età.
        Il return di questo metodo viene interpretato dagli algoritmi di ordinamento delle collections ad esempio
     */
    @Override
    public int compareTo(Animale a1) {
        //Il metodo compare ritorna 0 se entrambi i campi in input sono uguali,
        //un valore negativo se il primo campo è più piccolo del secondo,
        //un valore positivo se il primo campo è più grande del secondo.
        return Integer.compare(this.eta, a1.getEta());
    }

    /*
        Il metodo equals è un metodo definito in Object che identifica se due instanze della stessa classe sono uguali
        (lo si usa anche sulle stringhe per esempio che altro non sono che oggetti)

        Il metodo equals in questione controlla se il campo età ed il campo sesso siano esattamente uguali. Se ciò
        è verificato, i due oggetti sono uguali
     */
    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj)) {
            return false;
        }

        if (!(obj instanceof Animale)) {
            return false;
        }

        Animale a = (Animale) obj;

        return a.getEta() == this.eta && a.getSesso().equals(this.sesso);
    }

    /*
        Il metodo hashCode ritorna l'hash dell'oggetto in base ai campi sul quale si vuole calcolare l'hash.
        Avendo scritto il metodo equals su entrambi i campi della classe Animale, è utile scrivere il metodo hashCode
        su entrambi i campi poiché, se il metodo equals ritorna true su due oggetti, allora anche il loro hash sarà uguale.
     */
    @Override
    public int hashCode() {
        return Objects.hash(sesso, eta);
    }

    @Override
    public String toString() {
        return "Animale{" +
                "sesso='" + sesso + '\'' +
                ", eta=" + eta +
                '}';
    }
}
