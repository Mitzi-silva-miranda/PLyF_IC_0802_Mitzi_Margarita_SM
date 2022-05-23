public class Principal { // -- > Paso 1
    public static void main(String[] args) { // -- > Paso 2
        PruebaExamen PE; // -- > Paso 3
        
        PE = (a, b, c) -> System.out.println((a + b + c)); // -- > Paso 4
        PE.Operacion_Prueba(2, 4, 6);
        
        System.out.println(PruebaExamen.Operacion_Prueba(8, 10)); // -- > Paso 5
        
        PE.Mensaje_Hola(); // -- > Paso 6
        
        PE.Mensaje_Hola("Hola mundo"); // -- > Paso 7
        
        PE = (a, b, c) -> System.out.println((a + (b * c))); // -- > Paso 8
        PE.Operacion_Prueba(5, PruebaExamen.Operacion_Prueba(9, 3), PruebaExamen.Operacion_Prueba(9, 3)); // -- > Paso 9

        Mi_Metodo(PE); // -- > Paso 12
        
        Mi_Metodo((a,b,c) -> System.out.println((a + (b / c)))); // -- > Paso 13

        PE = (a, b, c) -> System.out.println(((float)a + ((float)b / (float)c))); // -- > Paso 16

        Mi_Metodo(PE, 1, 2, 3); // -- > Paso 17
    }

    private static void Mi_Metodo(PruebaExamen PE){ // -- > Paso 10
        PE.Operacion_Prueba(1, PruebaExamen.Operacion_Prueba(2, 2), PruebaExamen.Operacion_Prueba(3, 3)); // -- > Paso 11
    }
    private static void Mi_Metodo(PruebaExamen PE, int a, int b, int c){ // -- > Paso 14
        PE.Operacion_Prueba(a, PruebaExamen.Operacion_Prueba(b, b), PruebaExamen.Operacion_Prueba(c, c)); // -- > Paso 15
    }
}