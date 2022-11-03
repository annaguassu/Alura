package bytebankcomposto;

public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente Paulo = new Cliente();
		Paulo.nome = "Paulo Silveira";
		Paulo.cpf = "222.122.444-22";
		Paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//associa o cliente com a conta
		contaDoPaulo.titular = Paulo;
		System.out.println(contaDoPaulo.titular.nome);
	
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	
	}
}
