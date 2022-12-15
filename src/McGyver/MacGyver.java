package McGyver;

import McGyver.Constructions.Construction;
import McGyver.Construire.Constructeur;
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

    //TODO a quelle niveau je dois mettre ce commentaire, ici ou dans la classe Constructeur
    /**
     * @param plan
     * Fabrique un objet de type Construction à partir de l'inventaire de macgyver,
     * les resources utilisées seront enlevées de l'inventaire
     * @return Retourne null si la construction a échoué, sinon une implementation de Construction
     */
    public Construction fabriquerUnObjetAvecPlan(Plan plan){
        return Constructeur.construire(inventaire,plan);
    }

    private void ajouterALInventaire(MatierePremiere...item){
        List.of(item)
                .forEach(matierePremiere -> inventaire.put(matierePremiere,inventaire.getOrDefault(matierePremiere,1)));
    }

    public void recolterEtTransformer(Transformable... objet){
        var listObjet = List.of(objet);
        MatierePremiere[] matieresPremieresCollectees = listObjet.stream()
                .map(Transformable::transform)
                .flatMap(List::stream)
                .toArray(MatierePremiere[]::new);

        ajouterALInventaire(matieresPremieresCollectees);
    }

    public Map<MatierePremiere, Integer> getInventaire() {
        return inventaire;
    }
}
