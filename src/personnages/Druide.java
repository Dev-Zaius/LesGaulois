package personnages;

import java.util.Random;

public class Druide extends Gaulois{
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super(nom,0);
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + 
				" et ma potion peut aller d'une force " +
				effetPotionMin + " à " + effetPotionMax + " !");
	}

	public void booster(Gaulois gaulois){
		if (gaulois.getNom() == "Obélix"){
			this.parler("Non, Obélix !... Tu n'auras pas de potion magique !"
					+" (Tu es tombé dedans étant petit)");
		}
		else {
			gaulois.boirePotion(this.forcePotion);
		}
	}
	
	public void preparerPotion(int effetPotionMax) {
		Random random = new Random();
		this.forcePotion = random.nextInt(effetPotionMax - this.effetPotionMin) + this.effetPotionMin;
		if (forcePotion > 7) {
			this.parler("J'ai préparé une super potion de force : " + this.forcePotion);
		}
		else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, "
					+" ma potion est seulement de force : " + this.forcePotion);
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte +  " »");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
}
