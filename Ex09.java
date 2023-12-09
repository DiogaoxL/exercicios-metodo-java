package exerciciosmetodos;

//Crie um método chamado ehPalindromo que recebe uma string como parâmetro e retorna true se ela for um palíndromo e false caso contrário. 


public class Ex09 {
		
	static boolean ehPalindromo(String palindromo) {
		
		String textoFormatado = palindromo.replaceAll("\\s+" , "").toLowerCase();
		int comprimento = textoFormatado.length();
		
		for (int i = 0 ; i < comprimento/2 ; i++){
			if(textoFormatado.charAt(i) != textoFormatado.charAt(comprimento - 1 - i) ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String texto = "ovo";
		String textoSemEspaco = texto.replaceAll("\\s+" , "").toLowerCase();
		System.out.println("texto sem espaços: " + textoSemEspaco );
		System.out.println("É um palíndromo? " + ehPalindromo(textoSemEspaco));
	}

}
