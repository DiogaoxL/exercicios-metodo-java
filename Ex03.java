package exerciciosmetodos;

//Crie um método chamado calcularMedia que recebe um array de números como parâmetro e retorna a média deles. 

public class Ex03 {

	static int calcularMedia(int[] numero) {
		if(numero == null || numero.length == 0) {
			return 0;
		}
		
		int soma = 0;
		
		for (int i = 0; i < numero.length; i++)  {
			soma = soma + numero[i];
		}
		
		int media = soma / numero.length;
		
		return media;
	}

	public static void main(String[] args) {
		int[] valores = {10, 20, 30, 40, 50};
		
		System.out.println(calcularMedia(valores));	
		}

}
