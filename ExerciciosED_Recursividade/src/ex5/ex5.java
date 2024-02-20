package ex5;

public class ex5 {

	/*
	 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um
	 * número inteiro (N), apresente a saída da somatória SS = 1 + 1 2 + 1 3 + 1 4 +
	 * ... + 1 NN
	 * 
	 * • O Código deve apresentar, em formato de comentário, como foi definida a
	 * condição de parada; • O Código deve apresentar, em formato de comentário,
	 * como foi definida a relação de chamada dos passos;
	 */
	
	
	public static void main(String[] args) {
		int N = 5; // Substitua este valor pelo N desejado
		if (N > 0) {
			double resultado = calcularSomatoria(N);
			System.out.println("O resultado da somatória é: " + resultado);
		} else {
			System.out.println("N deve ser um número positivo.");
		}
	}

	// Função recursiva para calcular a somatória
	public static double calcularSomatoria(int N) {
		// Condição de parada: quando N atinge 1
		if (N == 1) {
			return 1.0;
		} else {
			// Relação de chamada recursiva: somatoria(N) = 1/N + somatoria(N-1)
			return 1.0 / N + calcularSomatoria(N - 1);
		}
	}
}
