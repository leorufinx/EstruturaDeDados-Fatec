package ex1;

public class ex1 {

	/*
	 * Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente
	 * o resultado da mul�plicação de A por B.
	 */

	public static int recursiva(int a, int b) {
		//condição de parada
		if (b == 0) {
			return 0;
		} else {
			return a + recursiva(a, b - 1);
		}
	}

	public static void main(String[] args) {
		int resultado = recursiva(5, 3);
		System.out.println(resultado);
	}
}
