package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;
	
	
	/* Constructeur par défaut */
	public Personne(){
		nom = "";
		prenom = "";
		adresse = new AdressePostale(1,"",1,"") ;
	}
	
	/* Constructeur avec paramétres */
	public Personne(String pNom, String pPrenom,AdressePostale aAdresse){
		nom = pNom;
		prenom = pPrenom;
		adresse = aAdresse;
	}
}
