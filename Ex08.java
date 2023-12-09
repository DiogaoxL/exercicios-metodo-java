package exerciciosmetodos;

// Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de inteiros como parâmetro e retorna o maior elemento presente nela. 

public class Ex08 {
	
	static int encontrarMaiorElemento(int[][] parametroMatriz ) {
		int maiorValor = 0;
		
		for(int i = 0 ; i < parametroMatriz.length ; i++) {
			for(int j = 0 ; j < parametroMatriz[i].length; j++) {
				if(parametroMatriz[i][j] > maiorValor) {
					maiorValor = parametroMatriz[i][j];
				}
			}
		}
		return maiorValor;
	}
	
	public static void main(String [] args) {
		int[][] matriz ={ {1,2,3,4} ,
						  {5,6,7,8}};
		System.out.println(encontrarMaiorElemento(matriz));
	}
}
