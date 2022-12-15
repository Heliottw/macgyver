package McGyver.Plan;

import McGyver.Constructions.Construction;
import McGyver.Matiere.MatierePremiere;

import java.util.List;
import java.util.Map;

public abstract class Plan {
    public Map<MatierePremiere, Integer> recette;
    public List<Runnable> etapes;

    public abstract Construction obtenirConstruction();
}
