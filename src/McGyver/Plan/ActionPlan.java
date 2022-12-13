package McGyver.Plan;

import McGyver.Matiere.MatierePremiere;

import java.util.Map;
import java.util.Random;

public class ActionPlan {

    public static boolean possedeMatieresPremieres(Map.Entry<MatierePremiere,Integer> itemRecette, Map<MatierePremiere,Integer> inventaire){
        return inventaire.containsKey(itemRecette.getKey()) && inventaire.get(itemRecette.getKey()) == itemRecette.getValue();
    }

    public static boolean brancherLesFilsSurLaBatterie(Map<MatierePremiere,Integer> inventaire) {
        System.out.println("MacGyver branche les fils sur la batterie");
        if ( new Random().nextInt(3) == 0) {
            System.out.println("""
                    MacGyver s'est trompé entre le + et le -. La batterie a explosé et vous etes mort.
                    """);
            throw new RuntimeException("Explosion de batterie");
        }
        return true;
    }

    public static boolean entourerDeFilsDeCuivre(Map<MatierePremiere,Integer> inventaire) {
        System.out.println("MacGyver enroule le cuivre");
        return true;
    }

}
