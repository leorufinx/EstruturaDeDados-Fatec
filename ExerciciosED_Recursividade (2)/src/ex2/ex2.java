package ex2;

public class ex2 {

	/*
	 * Criar uma função recursiva que receba o dividendo e o divisor de uma operação
	 * de divisão e, por subtrações, exiba o resto da divisão.
	 */

	public static int calculaResto(int divisor, int dividendo) {
		if (dividendo < divisor) {
			return dividendo;
		} else {
			return calculaResto(dividendo - divisor, divisor);
		}
	}

	public static void main(String[] args) {
		int dividendo = 10;
		int divisor = 2;
		int resto = calculaResto(dividendo, divisor);
		System.out.println("o resto da divisão é: " + resto);
	}
}
