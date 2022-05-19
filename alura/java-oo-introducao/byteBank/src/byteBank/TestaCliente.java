package byteBank;

public class TestaCliente {
	public static void main(String[] args) {
		Conta contaDoMiguel = new Conta();     // inicializa conta
		contaDoMiguel.titular = new Cliente(); // inicializa cliente e atribui ao titular da conta
		
		contaDoMiguel.titular.nome = "Miguel";
		System.out.println(contaDoMiguel.titular.nome);
	}
}
