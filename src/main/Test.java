package main;
import Politique.Village;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;


public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",6);
		
		Druide panoramix = new Druide("Panoramix",3,10);
		
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
		System.out.println("-------------------------------------------------"
				+ "-----------------------------");
		panoramix.preparerPotion(10);
		panoramix.preparerPotion(10);
		panoramix.preparerPotion(10);
		panoramix.preparerPotion(10);
		panoramix.preparerPotion(10);
	}

}
