package entites;

public class AdressePostale {
	int numeroRue; 
	String libelleVoie; 
	int codePostal; 
	String ville;
	
	/* Constructeur par d�faut */
	public AdressePostale(){
		numeroRue = 1; 
		libelleVoie = ""; 
		codePostal = 1; 
		ville = "?!?";
	}
	
	/* Constructeur avec param�tres */
	public AdressePostale(int nRue,String lVoie,int cP,String V){
		numeroRue = nRue; 
		libelleVoie = lVoie; 
		codePostal = cP; 
		ville = V;
	}
}
