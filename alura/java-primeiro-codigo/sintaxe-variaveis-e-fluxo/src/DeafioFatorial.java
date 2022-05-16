// Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!
public class DeafioFatorial {
	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			
			int fatorial = 1;
			
			for(int i = contador; i >= 1; i--) {
				fatorial *= i;
			}
			
			System.out.println(contador + "! = " + fatorial);
		}
		
		
		
	}
}
