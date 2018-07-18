package entites;

public class AdressePostale {
	int numeroRue; 
	String libelleVoie; 
	int codePostal; 
	String ville;
	
	/* Constructeur par défaut */
	public AdressePostale(){
		this.numeroRue = 1; 
		this.libelleVoie = ""; 
		this.codePostal = 1; 
		this.ville = "?!?";
	}
	
	/* Constructeur avec paramétres */
	public AdressePostale(int numeroRue,String libelleVoie,int codePostal,String ville){
		this.numeroRue = numeroRue; 
		this.libelleVoie = libelleVoie; 
		this.codePostal = codePostal; 
		this.ville = ville;
	}
}
