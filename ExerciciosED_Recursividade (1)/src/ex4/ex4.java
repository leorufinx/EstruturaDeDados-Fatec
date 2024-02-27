package ex4;

public class ex4 {

	/*
	 * Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor
	 * de inteiros, de N posições, passado como parâmetro: O código deve trazer como
	 * comentários: A condição de parada Como escrever a função para o termo n em
	 * função do termo anterior
	 */

	public static void main(String[] args) {
		int[] vetor = { -1, 2, -3, 4, -5 };
		int totalNegativos = contarElementosNegativos(vetor, vetor.length - 1);
		System.out.println("O total de elementos negativos no vetor é: " + totalNegativos);
	}

	// Função recursiva para contar o total de elementos negativos em um vetor
	public static int contarElementosNegativos(int[] vetor, int indice) {
		// Condição de parada: quando o índice atinge -1 (fora dos limites do vetor)
		if (indice == -1) {
			return 0;
		} else {
			// Condição para contar o elemento atual como negativo
			int elementosNegativosAnteriores = contarElementosNegativos(vetor, indice - 1);
			if (vetor[indice] < 0) {
				return 1 + elementosNegativosAnteriores;
			} else {
				return elementosNegativosAnteriores;
			}
		}
	}
}
