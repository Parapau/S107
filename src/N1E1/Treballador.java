package N1E1;

public class Treballador {
	private String nom, cognom;
	private int preu;
	
	public Treballador(String nom, String cognom, int preu) {
		this.nom = nom;
		this.cognom = cognom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getPreu() {
		return preu;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	public int calcularSou(int a) {
		return 1234554321 + a;//Esto deberia ser abstracto pero para demostrar que o sobreescriven pongo esto
	}
}
