package ex3;

public class ex3 {
	
	     /*Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
		  *recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
		  *O código deve trazer como comentários:
		  *A condição de parada
	      *Como escrever a função para o termo n em função do termo anterior
	      */
	
	
	public static void main(String[] args) {
		int numero = 10;

		//verificação se o numero é maior que 0 e menor que 12 
		if (numero >= 0 && numero <= 12) {
			
			// se passar do if, chama o resultado da do numero da função "recursivafatorial"
			int resultado = recursivafatorial(numero);
			System.out.println("o resultado da fatorial de " + numero + " é de: " + resultado);
		} else {
			System.out.println("resultado inválido");
		}

	}

	// se o numero for 0, ele retorna 1, pois 0 * 0 = 1;
	public static int recursivafatorial(int numero) {
		if (numero == 0) {
			return 1;
			
	// senão pega o numero 10 e multiplica pelo numero anterior dele;
		} else {
			return numero * recursivafatorial(numero - 1);
		}
	}
}
