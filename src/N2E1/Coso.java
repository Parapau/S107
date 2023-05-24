package N2E1;


@JSONSerialitzable
public class Coso {
	@JSONElement
	private String nom;
	
	@JSONElement
	private String cognom;
	
	@JSONElement(key = "edatPersona")
	private int edat;

	public Coso(String nom, String cognom, int edat) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	@init
	public void mite() {
		this.nom = "Jason";
		this.cognom = " i el vello d'or";
	}
	
	@Override
	public String toString() {
		return "nom: " + getNom() + " cognom: " + getCognom() + " edat: " + getEdat();
	}
}
