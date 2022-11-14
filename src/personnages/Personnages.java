package personnages;

public class Personnages {

	protected String nom;
	protected int force;

	public Personnages() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " »");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public int getForce() {
		return force;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force  + "]";
	}

}