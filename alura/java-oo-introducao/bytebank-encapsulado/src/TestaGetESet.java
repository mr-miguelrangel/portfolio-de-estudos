
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 456);
		
		conta.deposita(100); // deposita, saca e transfere fncionam como setters
		System.out.println("Saldo: " + conta.getSaldo());
		
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número: " + conta.getNumero());
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Miguel");
		System.out.println("Nome: " + cliente.getNome());
		
		conta.setTitular(cliente);
		System.out.println("Nome: " + conta.getTitular().getNome());
		
		System.out.println("Total: " + Conta.getTotal());
	}
}
