package bytebankencapsulado;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 1337;
		conta.setNumero(1337);//muda o numero da conta
		System.out.println(conta.getNumero());//mostra 

		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);

		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
	}

}
