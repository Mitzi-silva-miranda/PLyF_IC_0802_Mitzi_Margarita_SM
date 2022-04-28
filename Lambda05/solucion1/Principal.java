public class Principal {
	public static void main(String[] args) {
		//Solución 1
		System.out.println("\tResultado CalculadoraInt");
		Principal.engine((int x, int y) -> x + y);
		Principal.engine((int x, int y) -> x * y);
		Principal.engine((int x, int y) -> x / y);
		Principal.engine((int x, int y) -> x - y);
		Principal.engine((int x, int y) -> x % y);

		//Solucion 2
		System.out.println("\tResultado CalculadoraLong");
		Principal.engine((long x, long y) -> x + y);
		Principal.engine((long x, long y) -> x * y);
		Principal.engine((long x, long y) -> x / y);
		Principal.engine((long x, long y) -> x - y);
		Principal.engine((long x, long y) -> x % y);
	}

	//sobre carga de matodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
}