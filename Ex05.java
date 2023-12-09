package exerciciosmetodos;
import java.util.Scanner;

// Crie um método chamado contarVogais que recebe uma string como parâmetro e retorna o número de vogais nela. 

public class Ex05 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		
		int quantidadeDeVogais = contarVogais(palavra);
		
		System.out.println("A palavra " + palavra + " tem " + quantidadeDeVogais + " vogais ");
		
		sc.close();
	}
	
	static int contarVogais (String palavra) {
		
		int c = 0;
		
		for(int i = 0; i < palavra.length(); i++) {
			
			char letra = palavra.charAt(i);
			
			if(letra == 'a'  || letra == 'e'  || letra == 'i' || letra == 'o'  || letra == 'u') {
				
				c++;
			}
			
		}
		return c;
	}	
}
