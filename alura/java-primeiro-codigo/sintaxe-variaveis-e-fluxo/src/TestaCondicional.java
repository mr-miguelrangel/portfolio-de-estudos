
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, pode entrar.");
			} else {
				System.out.println("Voc� n�o pode entrar.");
			}
		}
	}

}
