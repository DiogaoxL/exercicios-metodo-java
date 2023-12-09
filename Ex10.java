package exerciciosmetodos;

import java.util.*;

//Ordenação Crescente: Implemente um método chamado ordenarCrescente que recebe um array de inteiros como parâmetro e o ordena em ordem crescente.

public class Ex10 {
	
	static void ordenarCrescente(int[] numero) {	
			Arrays.sort(numero);	
	}
	
	public static void main(String [] args){
		int [] array = {2,5,8,1};
		
		System.out.println(Arrays.toString(array));
		
		ordenarCrescente(array); //ordena os valores
		
		System.out.println("Em ordem crescente: " + Arrays.toString(array));
	}
}
