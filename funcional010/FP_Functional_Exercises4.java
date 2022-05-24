import java.util.List;

public class FP_Functional_Exercises4{
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		FP_Functional_Exercises4.numerospares(numbers);
		System.out.println("");
		
	}	
	private static void numerospares(List<Integer> numbers){
		for (int number : numbers ) {
			if ((number % 2 == 0)== true ) {
			}else{
				System.out.print(number+"= ");
				System.out.println(number*number*number);		
			}
		}
	}	

}