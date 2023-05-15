public class Case {
    int etat;
    int ligne;
    int colonne;
    char ressources;
    int quantite_ressource;

    public Case(int i ,int j) {
        etat=0;
        ligne=i;
        colonne=j;
    }

    public void Remplir_Case(char type_ressources, int total_ressource){
        ressources= type_ressources;
        quantite_ressource = total_ressource;
    }

}
