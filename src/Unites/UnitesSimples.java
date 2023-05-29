package Unites;
import Enum.*;
import Outils.Outils;

public class UnitesSimples extends UnitesGeneraux{
    private boolean expert;
    private int experience;
    private int fatigue;

    public UnitesSimples(String nom, EnumBoulot monEnumBoulot, Case position) {
        this.nom = nom;
        this.setOutil(new Outils(monEnumBoulot));
        this.expert = false;
        this.experience = 0;
        this.setPosition(position);
        this.setVitesse(1);
        this.setCout(1);
    }

    public void boulot() {
        Inventaire inventaire = Inventaire.getInstance();
        int faim = this.estCeQueExpert() ? this.getCout()*2 : this.getCout();
        if (!inventaire.possedeRessource(EnumRessources.MIAM,faim)){
            System.out.println(nom + " n'a pas assez de nourriture pour travailler");
            estCeQueExpert();
            return;
        }
        System.out.print(nom + "(" + this.getPosition().getX() + "," + this.getPosition().getY() + ") :");
        if(this.getPosition().consomerRessource(this.getOutil(),this.estCeQueExpert())){
            monteeDeNiveau();
        }
        else {
            estCeQueExpert();
        }

    }

    public boolean estCeQueExpert(){
        return this.expert;
    }

    public void toujoursExpertOuPas(){
        if (estCeQueExpert()){
            fatigue++;
            if (fatigue == 3){
                this.expert = false;
                this.experience = 0;
                this.setVitesse(1);
                this.setCout(1);
            }
        }
    }

    public void monteeDeNiveau(){
        if (this.expert){
            return;
        }
        if (this.experience == 10){
            this.expert = true;
            this.setVitesse(this.getVitesse()*2);
        }
        this.experience++;
    }
}
