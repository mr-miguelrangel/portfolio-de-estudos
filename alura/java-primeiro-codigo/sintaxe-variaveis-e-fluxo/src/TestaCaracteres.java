
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		valor = (char) (valor + 1); // se n�o converter o java considera o maior tipo, int nesse caso, e c�digo n�o compila
		System.out.println(valor);
		
		String palavra = "Miguel Rangel";
		System.out.println(palavra);
		palavra = palavra + 2022;
		System.out.println(palavra);
	}
}
