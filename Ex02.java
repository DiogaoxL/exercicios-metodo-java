package exerciciosmetodos;

//Implemente um método chamado ehPrimo que recebe um número como parâmetro e retorna true se ele for primo e false caso contrário. 

public class Ex02 {
	
	  static boolean ehPrimo(int numero) {
		
		if(numero <= 1) {
			return false;
		}
		
		for(int i = 2 ; i < numero ; i++) {
			if(numero % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
        System.out.println(ehPrimo(5)); // retorna true
        System.out.println(ehPrimo(10)); // retorna false
	}
}
