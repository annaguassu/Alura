package bytebankencapsulado;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//conta está inconsistente
		//conta.setAgencia(-50);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(3678, 36987);
		System.out.println(conta2.getAgencia());

		System.out.println(Conta.getTotal());
		
	}
}
