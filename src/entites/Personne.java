package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;
	
	
	/* Constructeur par d�faut */
	public Personne(){
		nom = "";
		prenom = "";
		adresse = new AdressePostale(1,"",1,"") ;
	}
	
	/* Constructeur avec param�tres */
	public Personne(String pNom, String pPrenom,AdressePostale aAdresse){
		nom = pNom;
		prenom = pPrenom;
		adresse = aAdresse;
	}
}
