package McGyver.Salle;

import McGyver.Matiere.MatierePremiere;
import McGyver.Transformable;

import java.util.List;

public class TelephoneFilaire implements Transformable {

    public List<MatierePremiere> transform(){
        return List.of(MatierePremiere.FilsDeCuivre);
    }
}
