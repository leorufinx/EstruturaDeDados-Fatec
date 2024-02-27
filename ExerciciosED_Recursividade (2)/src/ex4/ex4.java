package ex4;

public class ex4 {

	/*
	 * Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e
	 * retorne o fatorial duplo desse número (A entrada deve ser validada fora da
	 * função recursiva). O fatorial duplo é definido como o produto de todos os
	 * números naturais ímpares de 1 até algum número natural ímpar N. Assim, o
	 * fatorial duplo de 5 é:
	 */

	public static int fatorialDuplo(int N) {
		if (N == 1) {
			return 1;
		} else {
			return N * fatorialDuplo(N - 2);
		}
	}

	public static void main(String[] args) {
		int numeroimpar = 5;
		if (numeroimpar % 2 == 1 && numeroimpar > 0) {
			int resultado = fatorialDuplo(numeroimpar);
			System.out.println(resultado);
		} else {
			System.out.println("forneça um inteiro positivo impar");
		}
	}
}
