package N1E1;

public class Main {
	public static void main (String args[]) {
		Treballador treballador = new Treballador("Pep", "Guardiola", 5);
		TreballadorOnline treballadorOnline = new TreballadorOnline("Pep", "Guardiola", 5, 14);
		TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Pep", "Guardiola", 5);

		
		System.out.println(treballador.calcularSou(3));
		System.out.println(treballadorPresencial.calcularSou(3));
		System.out.println(treballadorOnline.calcularSou(3));
		
	}
}
