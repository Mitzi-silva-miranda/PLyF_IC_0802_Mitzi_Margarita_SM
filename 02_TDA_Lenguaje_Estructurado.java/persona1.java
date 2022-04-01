public class persona  {
	public static void main(String[] args) {


	//public void leer (String Nombre, String Apellidos, int edad, String genero){
		String nombre;
		String apellido; 
		String genero;
		int edad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre: \n");
		nombre=sc.nextLine();
		System.out.println("Apellido: \n");
		apellido=sc.nextLine();
		System.out.println("¿cual es tu edad?\n");
		edad=sc.nextInt();
		System.out.println("cual es tu genero? (H/M) \n");
		genero=sc.next();
		System.out.println("\n");
	/*} 
	
	public void persona( String nombre, String apellido, int edad, String genero){
		this.nombre = nombre;
		this.Apellidos= apellido;
		this.edad 	= edad;
		this.genero = genero;
	}
	public void imprimir(String nombre,String apellido,String genero,int edad){*/
		System.out.println("Nombre: persona");
		System.out.println("Nombre: "+nombre+"\napellido: "+apellido+"\nedad: "+edad+"\ngenero: "+genero);
	}
}