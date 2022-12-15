package McGyver.Construire;

import McGyver.Matiere.MatierePremiere;

import java.util.Map;
import java.util.Random;

public class ActionConstruction {


    public static void brancherLesFilsSurLaBatterie() throws ActionConstructionException{
        System.out.println("Etape : MacGyver branche les fils sur la batterie");
        if ( new Random().nextInt(3) == 0) {
            throw new ActionConstructionException("""
              Explosion de batterie
              MacGyver s'est trompé entre le + et le -, La batterie a explosé et vous etes mort.
                """);
        }
    }

    public static void entourerDeFilsDeCuivre() {
        System.out.println("Etape : MacGyver enroule le cuivre");
    }

}
