public class Principal {
	public static void main(String[] args) {
		//Solución 1
		System.out.println("\tResultado CalculadoraInt");
		Principal.engine((CalculadoraInt)(x, y) -> x + y);
		Principal.engine((CalculadoraInt)(x, y) -> x * y);
		Principal.engine((CalculadoraInt)(x, y) -> x / y);
		Principal.engine((CalculadoraInt)(x, y) -> x - y);
		Principal.engine((CalculadoraInt)(x, y) -> x % y);

		//Solucion 2
		System.out.println("\tResultado CalculadoraLong");
		Principal.engine((CalculadoraLong)(x, y) -> x + y);
		Principal.engine((CalculadoraLong)(x, y) -> x * y);
		Principal.engine((CalculadoraLong)(x, y) -> x / y);
		Principal.engine((CalculadoraLong)(x, y) -> x - y);
		Principal.engine((CalculadoraLong)(x, y) -> x % y);
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