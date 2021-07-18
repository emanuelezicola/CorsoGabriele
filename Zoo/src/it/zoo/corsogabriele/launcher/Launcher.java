package it.zoo.corsogabriele.launcher;

import it.zoo.corsogabriele.core.Animale;
import it.zoo.corsogabriele.core.Cane;
import it.zoo.corsogabriele.core.EssereVivente;
import it.zoo.corsogabriele.core.Umano;
import it.zoo.corsogabriele.core.leone.Leone;
import it.zoo.corsogabriele.core.leone.LeoneDomestico;
import it.zoo.corsogabriele.core.lupo.Lupo;
import it.zoo.corsogabriele.core.lupo.LupoDomestico;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {

        List<Animale> animali = new ArrayList<>();

        valorizzaAnimali(animali);

        animali.forEach(animale -> System.out.println(animale.faiVerso()));

        List<EssereVivente> esseriViventi = new ArrayList<>();
        esseriViventi.add(new Cane());
        esseriViventi.add(new Umano("M", 23, "CiccioGamer89"));


        System.out.println("\nPrima dell'ordinamento");
        //Per ogni animale lo stampo invocando automaticamente il toString definito nella classe Animale.
        animali.forEach(System.out::println);

        System.out.println("\nDopo l'ordinamento");
        animali.sort(Animale::compareTo);
        animali.forEach(System.out::println);


    }


    private static void valorizzaAnimali(List<Animale> animali) {
        Umano u = new Umano("M", 23, "CiccioGamer89");
        animali.add(u);

        animali.add(new Leone("M", 34));

        animali.add(new LeoneDomestico("M", 34, "Simba", u));

        animali.add(new Lupo("M", 29));

        animali.add(new LupoDomestico("M", 20, "Ghost", new Umano("M", 69, "Emanuele")));

    }

}
