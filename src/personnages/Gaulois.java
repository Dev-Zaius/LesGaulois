package personnages;
import objets.Musee;

public class Gaulois extends Personnages {
	int effetPotion = 1;
	private int nb_trophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees2[] = romain.recevoirCoup((force / 3));
		for (int i = 0; trophees2 != null && i < trophees2.length; i++ , nb_trophees++) {
			this.trophees[nb_trophees] = trophees2[i];
		}
	}
	
	this.Instanceof(Personnages);

//	public void frapper(Romain romain){
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}
	public void faireUneDonation(Musee musee) {
		super.parler("Je donne au musee tous mes trophees : ");
		for 
	}

	public void boirePotion(int forcePotion){
		this.effetPotion = forcePotion;
		String phrase = "Merci Druide, je sens que ma force est "
				+ this.effetPotion + " fois décuplée !";
		this.parler(phrase);
	}

	
	
}
