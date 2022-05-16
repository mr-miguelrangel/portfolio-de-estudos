
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario; // aqui convertemos o valor para int, conscientes da perda de info sobre a casa decimal
		
		System.out.println(valor);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
