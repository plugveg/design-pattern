import java.util.HashMap;
import java.util.List;

public class BatimentCreation extends Batiment {


    private java.util.HashMap<TypeRessource, Integer> HashMap;

    public BatimentCreation(String name, TypeBatiment batimentType) {
        super(name, batimentType);
    }

    public void DoAction(HashMap<TypeRessource, Integer> inventory) {
        super.DoAction(inventory); // Appel de la méthode DoAction() de la classe parente

        /*
        if (canBeBuilt(inventory)) {

            List<Outils> toolsList = Grille.getToolsList();
            TypeBatiment createdBuildingType = getBatimentType();

            Outils lowestLevelTool = null;

            for (Outils tool : toolsList) {
                if (tool.getType().equals(createdBuildingType)) {
                    if (lowestLevelTool == null || tool.getNiveau() < lowestLevelTool.getNiveau()) {
                        lowestLevelTool = tool;
                    }
                }
            }

            if (lowestLevelTool != null) {
                lowestLevelTool.setNiveau(lowestLevelTool.getNiveau() + 1);
            }
        } else {
            System.out.println("Vous n'avez pas les ressources nécessaires pour fabriquer cet outil");
        }

        */
    }

}
