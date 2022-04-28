public class Principal {
	public static void main(String[] args) {
		//Solución 1
		System.out.println("\tResultado CalculadoraInt");
		CalculadoraInt objInt = (x, y) -> x + y;
		CalculadoraInt objInt1 = (x, y) -> x * y;
		CalculadoraInt objInt2 = (x, y) -> x / y;
		CalculadoraInt objInt3 = (x, y) -> x - y;
		CalculadoraInt objInt4 = (x, y) -> x % y;
		Principal.engine(objInt);
		Principal.engine(objInt1);
		Principal.engine(objInt2);
		Principal.engine(objInt3);
		Principal.engine(objInt4);
		
		System.out.println("\tResultado CalculadoraLong");
		CalculadoraLong objLong = (x, y) -> x + y;
		CalculadoraLong objLong1 = (x, y) -> x * y;
		CalculadoraLong objLong2 = (x, y) -> x / y;
		CalculadoraLong objLong3 = (x, y) -> x - y;
		CalculadoraLong objLong4 = (x, y) -> x % y;
		Principal.engine(objLong);
		Principal.engine(objLong1);
		Principal.engine(objLong2);
		Principal.engine(objLong3);
		Principal.engine(objLong4);
		
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