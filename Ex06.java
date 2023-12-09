package exerciciosmetodos;

//Implemente um método chamado trocarValores que recebe dois inteiros como parâmetros e troca os valores entre eles. 

public class Ex06 {

	static void trocarValores(int n1, int n2) {

		int troca;

		troca = n1;
		n1 = n2;
		n2 = troca;

		System.out.println("os valores trocados " + n1 + " e " + n2);
	}

	public static void main(String[] args) {
		trocarValores(5 , 2);
	}
}
