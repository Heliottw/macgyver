package McGyver.Salle;

import McGyver.Matiere.MatierePremiere;
import McGyver.Transformable;

import java.util.List;

import static McGyver.Matiere.MatierePremiere.ConducteurDeCourant;
import static McGyver.Matiere.MatierePremiere.SourceDeCourant;

public class Voiture implements Transformable {

    public List<MatierePremiere> transform(){
        return List.of(ConducteurDeCourant,SourceDeCourant);
    }
}
