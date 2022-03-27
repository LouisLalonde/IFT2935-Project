package main.webapp.WEB_INF.classes;

/**
 * 
 */
public class Joueur extends Personne {
    int numero;
    Sanctions sanction;
    Date dn;
    Boolean blesse;
    String type_blessure;
    

    public Joueur(String nom, String prenom, int numero, Sanctions sanction, Date dn, Boolean blesse, String type_blessure) {
        super(nom, prenom);
        this.nom = nom;
        this.prenom = prenom;
        this.dn = dn;
    }



}
