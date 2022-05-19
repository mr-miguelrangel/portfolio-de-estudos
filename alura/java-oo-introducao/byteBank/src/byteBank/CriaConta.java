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
		
		System.out.println(primeiraConta); // primeiraConta e segundaConta n�o s�o objetos. Eles s�o vari�veis que guardam
										   // o endere�o de um objeto Conta na mem�ria do banco de dados
		
		primeiraConta.deposita(20);
		System.out.println(primeiraConta.saldo);
	}
}
