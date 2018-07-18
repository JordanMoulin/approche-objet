package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1= new Personne("Moulin","Jordan", new AdressePostale(98,"Rue du schtroumf",72230,"Mulsanne"));
		
		Personne p2= new Personne("noName","Michelangelo", new AdressePostale(1,"Egout",10016,"New York"));

	}

}
