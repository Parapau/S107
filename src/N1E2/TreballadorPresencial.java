package N1E2;

public class TreballadorPresencial extends Treballador {

	public TreballadorPresencial(String nom, String cognom, int preu) {
		super(nom, cognom, preu);
	}
	
	@Override
	public int calcularSou(int hores) {
		hores *= super.getPreu();
		return hores;
	}
	
	
	/**
     * @deprecated
     * Ningu en porta ja
     */
	@Deprecated
	public static void portarMarcareta() {
		System.out.println("has de portar mascareta");
	}

}
