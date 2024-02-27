package ex2;

public class ex2 {

	/*
	 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um
	 * vetor de inteiros, o tamanho do vetor e o valor da úl�ma posição do vetor
	 * como o primeiro menor valor, retorne o menor valor con�do neste vetor. O
	 * Código deve apresentar, em formato de comentário, como foi definida a
	 * condição de parada; O Código deve apresentar, em formato de comentário, como
	 * foi definida a relação de chamada dos passos;
	 */

	public static void main(String[] args) {
		int[] vetor = { 2, 8, 4, 5, 9 };

		// ver o tamanho do lenght
		int tamanho = vetor.length;

		if (tamanho > 0) {
			int menorValor = encontrarMenorValor(vetor, tamanho - 1, vetor[tamanho - 1]);
			System.out.println("O menor valor no vetor é: " + menorValor);
		} else {
			System.out.println("Vetor vazio. Não há menor valor.");
		}
	}

//Função recursiva para encontrar o menor valor em um vetor
	public static int encontrarMenorValor(int[] vetor, int indice, int menorAtual) {
		// Condição de parada: quando o índice atinge -1 (fora dos limites do vetor)
		if (indice == -1) {
			return menorAtual;
		} else {
			// Condição para atualizar o menor valor se o elemento atual for menor
			if (vetor[indice] < menorAtual) {
				menorAtual = vetor[indice];
			}
			// Chamada recursiva: encontrarMenorValor(vetor, indice-1, menorAtual)
			return encontrarMenorValor(vetor, indice - 1, menorAtual);
		}
	}
}
