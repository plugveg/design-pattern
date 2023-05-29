import java.util.Arrays;

public enum EnumBoulot {
    FERMIER(EnumRessources.MIAM),
    BUCHERON(EnumRessources.BOIS),
    MINEUR(EnumRessources.OR,EnumRessources.PIERRE);

    private final EnumRessources[] enumRessources;

    EnumBoulot(EnumRessources... monEnumRessources){
        this.enumRessources = monEnumRessources;
    }

    public EnumRessources[] getEnumRessources() {
        return enumRessources;
    }
}
