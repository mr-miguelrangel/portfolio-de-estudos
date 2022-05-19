package byteBank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
}
