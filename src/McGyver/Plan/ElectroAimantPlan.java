package McGyver.Plan;

import McGyver.Constructions.Construction;
import McGyver.Constructions.ElectroAimant;
import McGyver.Construire.ActionConstruction;
import McGyver.Matiere.MatierePremiere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static McGyver.Matiere.MatierePremiere.*;

public class ElectroAimantPlan extends Plan {

    public ElectroAimantPlan() {
        recette = Map.of(FilsDeCuivre, 1,SourceDeCourant, 1,ConducteurDeCourant, 1);
        etapes = List.of(ActionConstruction::brancherLesFilsSurLaBatterie, ActionConstruction::entourerDeFilsDeCuivre);
    }
    @Override
    public Construction obtenirConstruction() {
        return new ElectroAimant();
    }

}
