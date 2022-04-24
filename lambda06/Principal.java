public class Principal {
	public static void main(String[] args) {
		//Solución 1
		System.out.println("\tSolucion 1");
		Principal.engine((long x, long y) -> x + y);
		Principal.engine((int x, int y) -> x * y);
		Principal.engine((long x, long y) -> x / y);
		
		//Solucion 2
		System.out.println("\tSolucion 2");
		Principal.engine((CalculadoraInt)(x, y) -> x - y);
		Principal.engine((CalculadoraLong)(x, y) -> x % y);
		
		//Solucion 3
		System.out.println("\tSolucion 3");
		CalculadoraLong _calLong = (x, y) -> x + y;
		CalculadoraInt _calInt = (x, y) -> x * y;
		Principal.engine(_calLong);
		Principal.engine(_calInt);

	//sobre carga de matodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calculate(x, y);
		System.out.println("CalculadoraInt ==> resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calculate(x, y);
		System.out.println("CalculadoraLong ==> resultado = " + resultado);
	}
}