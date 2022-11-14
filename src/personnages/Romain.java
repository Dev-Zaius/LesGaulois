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
				System.out.println("Le soldat " + this.nom 
							+ " possède déjà un " 
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
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// precondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force == 0)
			parler("Aïe");
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null &&
				equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				}
				else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup += resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}
	
}
