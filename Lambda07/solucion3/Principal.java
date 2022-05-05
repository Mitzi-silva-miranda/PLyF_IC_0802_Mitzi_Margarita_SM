public class Principal{
	public static void main (String[] args){
		System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine_1((int)10, (int)3).calculate(5, 5));
    	        System.out.println("==> CalculadoraLong --> resultado = " + Principal.engine_2((long)4, (long)7).calculate(6, 2));
	}
	//Retorna un objeto de tipo "CalculadoraInt"
	public static CalculadoraInt engine_1(int x, int y){
		return (x1,y2) -> x * y;
		
	}
	//Retorna un objeto de tipo "CalculadoraLong"
	public static CalculadoraLong engine_2(long x, long y){
		return (x1,y2) -> x - y;
	}

}