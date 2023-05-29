package Unites;
import Outils.Outils;

import java.util.ArrayList;
import java.util.List;
public class GroupeUnites extends UnitesGeneraux {
    private final List<UnitesSimples> unitad;

    public GroupeUnites(UnitesGeneraux unite) {
        this.unitad = new ArrayList<>();
        if(unite.getClass().isInstance(GroupeUnites.class)){
            GroupeUnites uniteGroupe = (GroupeUnites) unite;
            unitad.addAll(uniteGroupe.unitad);
        }
        else{
            unitad.add((UnitesSimples) unite);
        }
    }

    public void ajouterUneUnite(UnitesGeneraux unite){
        if(unite.getClass().isInstance(GroupeUnites.class)){
            GroupeUnites uniteGroupe = (GroupeUnites) unite;
            unitad.addAll(uniteGroupe.unitad);
        }
        else{
            unitad.add((UnitesSimples) unite);
        }
    }

    public void boulot() {
        for(UnitesSimples unite : unitad)
            unite.boulot();
    }

    public int getVitesse() {
        int vitesse = 0;
        for(UnitesSimples unite : unitad){
            if (unite.getVitesse() > vitesse) {
                vitesse = unite.getVitesse();
            }
        }
        return vitesse;
    }

    public Outils getOutil() {
        return unitad.get(0).getOutil();
    }
}
