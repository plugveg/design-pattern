import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grille extends JPanel {
        Case[][] LesCases;
        List<String> LesRessources = new ArrayList<String>();
        List<String> LesOutils = new ArrayList<String>();


        //Creation d'un inventaire
        public HashMap<String,Integer> Inventaire(int nbr_de_depart, List<String> LesRessources){

            HashMap<String,Integer> Inventaire = new HashMap<String,Integer>();

            for (String Ressource : LesRessources){
                Inventaire.put(Ressource,nbr_de_depart);
            }
            return Inventaire;
        }





        public Grille(int N){
            LesCases = new Case[N][N]; // Creer l'espace mémoire pour les cases

            //Creation d'une liste de ressource contenant "Bois","Pierre","Nourriture"
            LesRessources.add("Null");
            LesRessources.add("Stne");
            LesRessources.add("Wood");
            LesRessources.add("Food");

            //Creation d'une liste d'outil contenant "Hache","Pioche","Houe"
            LesOutils.add("Hache");
            LesOutils.add("Pioche");
            LesOutils.add("Houe");

            //Creation Inventaire de depart
            HashMap<String,Integer> InventaireRessource = Inventaire(10,LesRessources);
            HashMap<String,Integer> InventaireOutil = Inventaire(10,LesOutils);
            //Affichage de l'inventaire
            System.out.println(InventaireRessource);
            System.out.println(InventaireOutil);


            for (int i=0; i<N ; i++ ){
                for (int j=0; j<N ; j++){
                    LesCases[i][j] = new Case(i,j); //associe chaque case à son adresse

                    //Rempli la case avec une ressource aléatoire
                    LesCases[i][j].Remplir_Case(LesRessources.get((int)(Math.random() * 4)),(int)(Math.random() * 100));



                }
            }

        }

        public void AfficherGrille(int N){
            for (int i=0; i<N ; i++ ){
                for (int j=0; j<N ; j++){
                    System.out.print("["+LesCases[i][j].ressources+"] ");
                }
                System.out.println();
            }
        }

}
