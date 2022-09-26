package main;
import Politique.Village;

import personnages.Gaulois;
import personnages.Romain;


public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
	}

}
