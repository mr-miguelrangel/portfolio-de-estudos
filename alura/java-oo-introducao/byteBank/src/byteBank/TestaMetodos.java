package byteBank;

public class TestaMetodos {
	public static void main(String[] args) {
		
		Conta contaDoMiguel = new Conta();
		Conta contaDaLaura = new Conta();
		
		contaDoMiguel.deposita(1000);
		contaDaLaura.deposita(1000);
		System.out.println("Saldo Miguel: " + contaDoMiguel.saldo);
		System.out.println("Saldo Laura: " + contaDaLaura.saldo);
		
		contaDoMiguel.saca(100);
		contaDaLaura.saca(200);
		System.out.println("Saldo Miguel: " + contaDoMiguel.saldo);
		System.out.println("Saldo Laura: " + contaDaLaura.saldo);
		
		contaDoMiguel.transfere(300, contaDaLaura);
		System.out.println("Saldo Miguel: " + contaDoMiguel.saldo);
		System.out.println("Saldo Laura: " + contaDaLaura.saldo);
	}
	
}
