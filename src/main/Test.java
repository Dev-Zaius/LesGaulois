package main;
import Politique.Village;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obélix = new Gaulois("Obélix",10);
		Romain minus = new Romain("Minus",6);
		
		Druide panoramix = new Druide("Panoramix",3,10);

		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(10);
		panoramix.booster(obélix);
		obélix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
	}

}
