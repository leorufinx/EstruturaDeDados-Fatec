package ex1;

public class ex1 {

	/*
	 * Criar uma aplicação em Java que tenha uma função recursiva que calcule o
	 * somatório do N primeiros número NATURAIS (a função deve retornar zero para
	 * números nega�vos) O Código deve apresentar, em formato de comentário, como
	 * foi definida a condição de parada; O Código deve apresentar, em formato de
	 * comentário, como foi definida a relação de chamada dos passos;
	 */

	public static void main(String[] args) {
		int numero = 10;
		int resultado = recursiva(numero);
		System.out.println("somatório dos N primeiros números naturais até "+numero+" é: "+ resultado);
	}

	public static int recursiva(int numero) {
		
		// Condição de parada: Retorna 0 para números negativos
		if (numero < 0) {
			return 0;
			
		// se nao for 0 ele pega o numero 10 como "numero" e dps pega a recursiva pra calcular o 10-1 pra fazer a soma
		} else {
			return numero + recursiva(numero - 1);
		}
	}
}