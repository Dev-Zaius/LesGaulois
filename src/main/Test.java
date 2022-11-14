package main;
import Politique.Village;
import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Personnages;
import personnages.Romain;
import personnages.Equipement;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",2);
		Gaulois obélix = new Gaulois("Obélix",25);
		Romain minus = new Romain("Minus",8);
		Village village = new Village("Village des Irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix",6,8,village);

		
		Personnages gaulois = village.trouverHabitant(29);
		// index out of bound car bornes dépassées
		
		Druide panoramix = new Druide("Panoramix",3,10);

		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obélix);
		village.setChef(abraracourcix);
		village.afficherVillageois();
		
		System.out.println("--------------------------------------------");

		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		
		System.out.println("--------------------------------------------");
		//Gaulois mongaulois = village.trouverHabitant(1);
		// Le gaulois mongaulois existe déjà il s'agit de asterix !
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(10);
		panoramix.booster(obélix);
		obélix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
		minus.parler("Trop injuste !");
	}
}
