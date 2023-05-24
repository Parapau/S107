package N1E2;

public class TreballadorOnline extends Treballador{

	private final int tarifa;
	
	public TreballadorOnline(String nom, String cognom, int preu, int tarifa) {
		super(nom, cognom, preu);
		this.tarifa=tarifa;
	}
	
	public int getTarifa() {
		return tarifa;
	}

	@Override
	public int calcularSou(int hores) {
		hores *= super.getPreu();
		hores += getTarifa();
		return hores;
	}
	/**
     * @deprecated
     * el gat es va morir :'(
     */
	@Deprecated
	public static void donarDeMenjarAlGat() {
		System.out.println("dona-li de menjar al gat");
	}
	
}
