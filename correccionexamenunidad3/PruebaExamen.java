public interface PruebaExamen{ // -- > Paso 1
	public default void Mensaje_Hola(){ // --> Paso 2
		System.out.println("Hola mi nombre es: mitzi"); // --> Paso 3
	}

	public default void Mensaje_Hola(String cadena){ // --> Paso 4
		System.out.println("La cadena es: "+ cadena);
	}

    public static int Operacion_Prueba(int a,int b){ // --> Paso 5
        return a + b; // --> Paso 6
    }

    public void Operacion_Prueba(int a,int b,int c); //--> Paso 7

}