package Enum;

import java.util.Arrays;

public enum EnumBoulot {
    FERMIER(EnumRessources.MIAM),
    BUCHERON(EnumRessources.BOIS),
    MINEUR(EnumRessources.OR, EnumRessources.PIERRE);

    private final EnumRessources[] enumRessources;

    EnumBoulot(EnumRessources... monEnumRessources){
        this.enumRessources = monEnumRessources;
    }

    public boolean estCeQueBonOutil(EnumRessources monEnumRessources){
        return Arrays.stream(this.enumRessources).anyMatch(typeRessource1 -> typeRessource1 == monEnumRessources);
    }

    public EnumRessources[] getEnumRessources() {
        return enumRessources;
    }
}
