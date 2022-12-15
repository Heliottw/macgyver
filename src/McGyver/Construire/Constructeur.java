package McGyver.Construire;

import McGyver.Constructions.Construction;
import McGyver.Matiere.MatierePremiere;
import McGyver.Plan.Plan;

import java.util.HashMap;
import java.util.Map;

public class Constructeur {

    public static Construction construire(Map<MatierePremiere, Integer> inventaire, Plan plan){
        try {
            if (verifierInventaireRecette(inventaire,plan.recette)) {
                supprimerMatieresPremieresUtilisees(inventaire,plan.recette);
                plan.etapes.forEach(Runnable::run);
                return plan.obtenirConstruction();
            }
            throw new RecetteException("Les matieres premieres de l'inventaire ne corresponde pas");
        }catch(RecetteException | ActionConstructionException e){
            e.printStackTrace();
            return null;
        }
    }

    private static boolean verifierInventaireRecette(Map<MatierePremiere, Integer> inventaire, Map<MatierePremiere,Integer> recette){
        return recette.keySet().stream()
                .allMatch(key -> inventaire.containsKey(key) && inventaire.get(key) >= recette.get(key));
    }

    private static void supprimerMatieresPremieresUtilisees(Map<MatierePremiere, Integer> inventaire, Map<MatierePremiere,Integer> recette) {
        inventaire.keySet().stream()
                .filter(key -> recette.containsKey(key))
                .forEach(key -> inventaire.put(key, inventaire.get(key) - 1));
    }
}
