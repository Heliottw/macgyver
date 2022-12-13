package McGyver;

import McGyver.Constructions.Construction;
import McGyver.Plan.Plan;
import McGyver.Matiere.MatierePremiere;
import McGyver.Salle.Perruque;

import java.util.*;

public class MacGyver {
    private Map<MatierePremiere,Integer> inventaire;
    private boolean MacGyverMode = false;


    public MacGyver() {
        inventaire = new HashMap<>();
    }

    public void equiperSaPerruque(Perruque perruque){
        System.out.println("Vous avez peut etre l'air ridicule avec cette perruque mais vous vous appelez Mac Gyver !!!");
        MacGyverMode = true;
    }

    public Construction utiliserUnPlanDeConstruction(Plan plan) {
        return plan.build(inventaire);
    }

    private void ajouterALInventaire(MatierePremiere...item){
        List.of(item).forEach(matierePremiere -> inventaire.put(matierePremiere,inventaire.getOrDefault(matierePremiere,1)));
    }

    public void recolterEtTransformer(List<Transformable> listObjet){
        MatierePremiere[] matieresPremieresCollectees = listObjet.stream()
                .map(Transformable::transform)
                .flatMap(List::stream)
                .toArray(MatierePremiere[]::new);

        ajouterALInventaire(matieresPremieresCollectees);
    }
}
