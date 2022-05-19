package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta); // primeiraConta e segundaConta não são objetos. Eles são variáveis que guardam
										   // o endereço de um objeto Conta na memória do banco de dados
		
		primeiraConta.deposita(20);
		System.out.println(primeiraConta.saldo);
	}
}
