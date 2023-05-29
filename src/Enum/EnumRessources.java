package Enum;

public enum EnumRessources {
    BOIS(10, "leBois"),
    PIERRE(10, "laPierre"),
    OR(10, "L'Or"),
    MIAM(10, "La graille");

    private final int cout;
    private final String signification;

    EnumRessources(int monCout, String maSignification ){
        this.cout = monCout;
        this.signification = maSignification;
    }

    public int getCout() {
        return cout;
    }

    public String getSignification() {
        return signification;
    }
}
