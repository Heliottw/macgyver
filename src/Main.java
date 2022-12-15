import McGyver.Constructions.Construction;
import McGyver.MacGyver;
import McGyver.Plan.ElectroAimantPlan;
import McGyver.Salle.Perruque;
import McGyver.Salle.TelephoneFilaire;
import McGyver.Salle.Voiture;
import McGyver.Transformable;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Objets pieces valide pour la recette de l'aimant
        Transformable[] objetsPiece = {new TelephoneFilaire(),new Voiture(), new Perruque()};

        //Objets pieces non valide pour la recette de l'aimant
        //Transformable[] objetsPiece1 = {new TelephoneFilaire(), new Perruque()};

        ElectroAimantPlan electroAimantPlan = new ElectroAimantPlan();
        MacGyver macGyver = new MacGyver();

        macGyver.equiperSaPerruque(new Perruque());
        macGyver.recolterEtTransformer(objetsPiece);

        Optional.ofNullable(macGyver.fabriquerUnObjetAvecPlan(electroAimantPlan))
                .ifPresent(Construction::utiliser);

    }
}
