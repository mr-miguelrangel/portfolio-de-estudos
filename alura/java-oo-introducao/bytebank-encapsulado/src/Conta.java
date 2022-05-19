

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; // essa variável remete à classe Conta e não a um objeto do tipo Conta
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;  // ao inicializar uma conta, os argumentos serão passados aos atributos
		this.numero = numero;
		total++;
		
		System.out.println("Estou criando uma conta.");
	}
	
	public void deposita(double valor) {  // a conta não é argumento pois chamamos o método usando o objeto
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) { 
			this.saca(valor);
			destino.deposita(valor);
			
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
