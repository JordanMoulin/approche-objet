package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;

	
	/* Constructeur par défaut */
	public Personne(){
		this.nom = "";
		this.prenom = "";
		this.adresse = new AdressePostale(1,"",1,"") ;
	}

	/* Constructeur avec paramétres */
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}

	/* Constructeur avec paramétres */
	public Personne(String nom, String prenom,AdressePostale adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String getNom(){  
		return nom;
	}


	public String getPrenom(){
		return prenom;
	}
	
	public AdressePostale getAdresse(){
		return adresse;
	}

	public void setNom(String pNom){
		nom = pNom;
	}

	public void setPrenom(String pPrenom){
		prenom = pPrenom;

	}
	
	public void setAdresse(AdressePostale pAdresse){
		adresse = pAdresse;

	}

	
}
