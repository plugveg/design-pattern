package Outils;
import Enum.*;

public class Outils {
    private int niveau;
    private EnumBoulot type;

    public Outils(EnumBoulot monEnumBoulot){
        this.type = monEnumBoulot;
        this.niveau = 1;
    };

    public boolean estCeQueBonOutil(EnumRessources monEnumRessources){
        return type.estCeQueBonOutil(monEnumRessources);
    }

    public EnumRessources[] getEnumRessources() {
        return type.getEnumRessources();
    }

    public int getNiveau() {
        return niveau;
    }

    public EnumBoulot getType() {
        return type;
    }
}