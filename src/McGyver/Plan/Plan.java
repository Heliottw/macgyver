package McGyver.Plan;

import McGyver.Constructions.Construction;
import McGyver.Matiere.MatierePremiere;

import java.util.Map;

public interface Plan {

    Map<MatierePremiere, Integer> supprimerMatieresPremieresUtilisees(Map<MatierePremiere, Integer> inventaire);
    Construction build(Map<MatierePremiere,Integer> inventaire);
}
