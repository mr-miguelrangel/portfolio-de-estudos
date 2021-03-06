
public class TestaPontoFlutuante {
	
	public static void main(String[] arg) {
		
		double salario = 1250.70;
		System.out.println("Meu sal?rio ? R$" + salario);
		
		int divisao = 5 / 2; // aqui o ponto flutuante ? ignorado por lidar com inteiros
		System.out.println("Divisao de 5 por 2 truncada declarada como int: " + divisao); // a sa?da ser? 2
		
		double novaDivisao = 5 / 2; // retorna 2, uma vez que o compilador l? o c?digo da direita para a esquerda
		System.out.println("Divis?o de 5 por 2 truncada declarando como double: " + novaDivisao); // o resultado ? um double, mas foi truncado
		
		double divisaoCorreta = 5.0 / 2; // um dos operandos deve ser double para que a opera??o resulte num double que ser? atribuido ? vari?vel
		System.out.println("Divis?o exata de 5 por 2: " + divisaoCorreta);
		
		/* Se fizermos o seguinte:
		 * int divisao = 5.0 / 2;
		 * 
		 * O programa n?o compila*/
	}

}
