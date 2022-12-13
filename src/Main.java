import McGyver.Constructions.ElectroAimant;
import McGyver.Plan.ElectroAimantPlan;
import McGyver.MacGyver;
import McGyver.Salle.Perruque;
import McGyver.Salle.TelephoneFilaire;
import McGyver.Salle.Voiture;
import McGyver.Transformable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transformable> objetsPiece = List.of(new TelephoneFilaire(),new Voiture(), new Perruque());
        ElectroAimantPlan electroAimantPlan = new ElectroAimantPlan();
        MacGyver macGyver = new MacGyver();
        macGyver.equiperSaPerruque(new Perruque());

        macGyver.recolterEtTransformer(objetsPiece);

        ElectroAimant electroAimant = (ElectroAimant) macGyver.utiliserUnPlanDeConstruction(electroAimantPlan);

        electroAimant.utiliser();

    }
}