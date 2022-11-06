package bytebankherdado;

public class Designer extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();//ao inves do this (que funfa, usa o super mostrando que senha está na superclasse
	}
}
