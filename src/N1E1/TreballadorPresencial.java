package N1E1;

public class TreballadorPresencial extends Treballador {

	public TreballadorPresencial(String nom, String cognom, int preu) {
		super(nom, cognom, preu);
	}
	
	@Override
	public int calcularSou(int hores) {
		hores *= super.getPreu();
		return hores;
	}
	

}
