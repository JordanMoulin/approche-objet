package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 98;
		adresse1.codePostal = 72230;
		adresse1.ville = "Mulsanne";
		adresse1.libelleVoie = "Rue du schtroumf";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 25;
		adresse2.codePostal = 44000;
		adresse2.ville = "Nantes";
		adresse2.libelleVoie = "Rue du ouistiti";
	}

}
