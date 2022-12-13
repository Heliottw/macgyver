package McGyver.Plan;

import McGyver.Constructions.ElectroAimant;
import McGyver.Matiere.MatierePremiere;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import static McGyver.Matiere.MatierePremiere.*;

public class ElectroAimantPlan implements Plan {

    //pourquoi pas mettre des methodes pour vérifier si il a tous dans l'inventaire
    //et des methodes pour effectuer les actions avec pourcentage de risque
    public Map<MatierePremiere, Integer> recette;

    public ElectroAimantPlan() {
        recette = new HashMap<>();
        recette.put(FilsDeCuivre, 1);
        recette.put(SourceDeCourant, 1);
        recette.put(ConducteurDeCourant, 1);
    }

    private boolean verifierInventaire(Map<MatierePremiere, Integer> inventaire) {
        return recette.entrySet().stream()
                .allMatch(itemRecette -> ActionPlan.possedeMatieresPremieres(itemRecette, inventaire));
    }

    @Override
    public Map<MatierePremiere, Integer> supprimerMatieresPremieresUtilisees(Map<MatierePremiere, Integer> inventaire) {
        recette.keySet().stream()
                .forEach(key->inventaire.put(key,inventaire.get(key)-1));
        return inventaire;
    }

    @Override
    public ElectroAimant build(Map<MatierePremiere, Integer> inventaire) {
        return Stream.of(inventaire)
                .filter(e -> verifierInventaire(inventaire))
                .map(e -> supprimerMatieresPremieresUtilisees(e))
                .filter(ActionPlan::brancherLesFilsSurLaBatterie)
                .filter(ActionPlan::entourerDeFilsDeCuivre)
                .map(e -> new ElectroAimant())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ne contient pas les element necessaire pour construire un electroaimant"));
    }

}
