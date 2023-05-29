package Unites;
import Outils.Outils;

public class UnitesGeneraux {
    public String nom;
    private int vitesse;
    private int cout;
    private Outils outil;


    public void deplacer(){
        if(this.getOutil().estCeQueBonOutil(this.getPosition().getTypeRessource())){
            return;
        }
        for (int i = 0; i < this.getVitesse(); i++) {
            //
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public Outils getOutil() {
        return outil;
    }

    public void setOutil(Outils outil) {
        this.outil = outil;
    }
}
