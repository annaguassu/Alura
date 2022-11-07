package bytebankherdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Funcionario nico = new Funcionario();
		Gerente nico = new Gerente();

		nico.setNome("Nico Steppat");
		nico.setCpf("273890648-67");
		nico.setSalario(2600.00);
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.0;
		
	}
	
}
