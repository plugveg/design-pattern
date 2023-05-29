public class Ressource {
    private TypeRessource type;
    private int quantity;

    public Ressource(TypeRessource type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public TypeRessource getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}