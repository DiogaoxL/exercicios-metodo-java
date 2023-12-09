package exerciciosmetodos;

//Implemente um método chamado fatorial que calcula o fatorial de um número passado como parâmetro.

public class Ex04 {
 public static void main(String [] args) {	
	 int fatorial = soma(1,5);
	 
	 System.out.println(fatorial);
	 }
 
 static int soma(int comeco , int fim) {
	
	 if(fim > comeco) {
		 return fim * soma(comeco, fim - 1);
	 } else {
		 return fim;
	 }
	 
 }
}
