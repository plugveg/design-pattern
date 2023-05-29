import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Batiment {
    private String name;
    private TypeBatiment batimentType;
    private List<Ressource> requiredResources;

    public Batiment(String name, TypeBatiment batimentType, List<Ressource> requiredResources) {
        this.name = name;
        this.batimentType = batimentType;
        this.requiredResources = requiredResources;
    }

    public Batiment(String name, TypeBatiment batimentType) {
        this.name = name;
        this.batimentType = batimentType;
    }

    public String getName() {
        return name;
    }

    public TypeBatiment getBatimentType() {
        return batimentType;
    }

    public List<Ressource> getRequiredResources() {
        return requiredResources;
    }

    public boolean canBeBuilt(HashMap<TypeRessource, Integer> inventory) {
        for (Ressource requiredResource : requiredResources) {
            if (!inventory.containsKey(requiredResource.getType()) || inventory.get(requiredResource.getType()) < requiredResource.getQuantity()) {
                return false;
            }
        }
        return true;
    }

    public void DoAction(HashMap<TypeRessource, Integer> inventory) {
    }
}