package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1= new Personne("Moulin","Jordan");
		AdressePostale a = new AdressePostale(98,"Rue du schtroumf",72230,"Mulsanne");
		p1.setAdresse(a);
	}
}
