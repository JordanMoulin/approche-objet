package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1= new Personne();
		p1.prenom = "Jordan";
		p1.nom = "Moulin";
		p1.adresse.numeroRue = 98;
		p1.adresse.codePostal = 72230;
		p1.adresse.ville = "Mulsanne";
		p1.adresse.libelleVoie = "Rue du schtroumf";

	}

}
