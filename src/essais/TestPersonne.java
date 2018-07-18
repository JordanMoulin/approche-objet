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
		
		Personne p2= new Personne();
		p2.prenom = "Ouba";
		p2.nom = "Ouba";
		p2.adresse.numeroRue = 1;
		p2.adresse.codePostal = 1337;
		p2.adresse.ville = "Tropico";
		p2.adresse.libelleVoie = "Rue du oubaouba";

	}

}
