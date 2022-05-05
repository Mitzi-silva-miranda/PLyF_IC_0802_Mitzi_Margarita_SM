public class Principal {
	public static void main(String [] args){

	Principal.engine((int x, int y) -> (long x1, long y2) -> x1 + y2);

	}
	private static void engine(CalcularInt cal){
	           int x=2, y=4;
	           CalcularLong resultado=cal.calcular(x, y);
	         System.out.println(resultado.calcular((long)x,(long)y));
	}
        private static void engine(CalcularLong cal){
	           long x=2, y=3;
	           long resultado=cal.calcular(x, y);
	           System.out.println(resultado);          
	}
}