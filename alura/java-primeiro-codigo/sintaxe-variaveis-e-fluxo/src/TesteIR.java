
public class TesteIR {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (1900 >= salario && salario <= 2800) {
			System.out.println("A al�quota � de 7,5% e pode deduzir R$ 142,00.");
		} else {
			if (2800.01 <= salario && salario <= 3571) {
				System.out.println("A al�quota � de 15% e pode deduzir R$ 350,00.");
			} else {
				if (3571.01 <= salario && salario <= 4664) {
					System.out.println("A al�quota � de 22,5% e pode deduzir R$ 636,00.");
				}
			}
		}
	}
}
