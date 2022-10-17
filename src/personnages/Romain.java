package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	private int pos = 0;
	private boolean DejaVu = false;
	
	public Romain(String nom, int force) {
		assert (force > 0) : "la force ne doit pas être négative";
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	public String getNom() {
		return nom;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + this.nom +
					           " est déjà bien protégé !");
			break;
		case 1 :
			if (equipement.toString().equals(equipements[0].toString())) {
				System.out.println("Le soldat " + this.nom + 
				           " possède déjà un " 
				           + equipement.toString() + " !" );
				break;
			}
		default :
				System.out.println("Le soldat " + this.nom 
						+ " s'équipe avec un " + equipement.toString() 
						+ " !");
				this.equipements[nbEquipement] = equipement;
				nbEquipement++;
			break;
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " »");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert (forceCoup> 0) : "la force du coup ne doit pas être négative";
		int forceInitiale = this.force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert (forceInitiale > force) : "la force doit avoir diminuée";

	}
}
