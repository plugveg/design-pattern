import java.util.HashMap;
import java.util.List;

public class BatimentProduction extends Batiment {

    public BatimentProduction(String name, TypeBatiment batimentType) {
        super(name, batimentType);
    }

    public void DoAction(HashMap<TypeRessource, Integer> inventory) {
        super.DoAction(inventory); // Appel de la méthode DoAction() de la classe parente

        if (canBeBuilt(inventory)) {
            // TODO implémenter ici l'action spécifique du bâtiment de production
            // Fonction pour créer les outils
        }
        else {
            System.out.println("Vous n'avez pas les ressources nécessaires pour fabriquer cette unité");
        }
    }
}
