package ex3;

public class ex3 {

	/*
	 * Construir uma função recursiva que receba um vetor e seu tamanho e apresente
	 * a quan�dade de números pares existentes no vetor. Considere que a entrada
	 * deve ser, apenas de números naturais diferentes de zero.
	 */

	public static int contaPares(int[] vetor, int tamanho) {
		
		if(tamanho == 0) {
			return 0;
		} else {
			//verifica se é par;
			int contagem = (vetor[tamanho -1] % 2 == 0) ? 1 : 0;
			
			return contagem + contaPares(vetor, tamanho -1);
		}
	}
	
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6,7,8,9,0};
		int tamanho = vetor.length;
		int qtdpares = contaPares(vetor, tamanho);
		System.out.println("Quantidade de pares: " + qtdpares);
	}
}
