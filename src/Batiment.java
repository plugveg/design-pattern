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

    

    public String getName() {
        return name;
    }

    public TypeBatiment getBatimentType() {
        return batimentType;
    }

    public List<Ressource> getRequiredResources() {
        return requiredResources;
    }


}