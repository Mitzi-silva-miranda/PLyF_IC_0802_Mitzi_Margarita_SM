public class LambdaTest{
	public static void main(String[] args){

	    //Expresión lambda ==> representa un objeto de una interfaz funcional
	    FunctionTest ft=() -> System.out.println("Hola Mundo");//Implementación del método abstracto "saludar()"
	                                                          //de la Interfaz funcional
	   ft.saludar();
	}
}