package exerciciosmetodos;
import java.util.Scanner;

//Crie um método chamado converterCelsiusParaFahrenheit que recebe uma temperatura em graus Celsius como parâmetro e retorna a temperatura equivalente em Fahrenheit. 

public class Ex07 {
	
	static float converterCelsiusParaFahrenheit(float temperaturaCelsius) {
		
		float conversao = ((temperaturaCelsius * 9)/5)+32f;
		
		return conversao;
		
	}
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em °C para °F");
		float temperatura = sc.nextFloat();
		float mostrarTela = converterCelsiusParaFahrenheit(temperatura);
		
		System.out.println("A temperatura é " + mostrarTela + " °F");
		
		sc.close();
	}
}
