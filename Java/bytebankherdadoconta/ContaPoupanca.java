package bytebankherdadoconta;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, int numero) { //os construtores n sao herdados
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo+= valor;
	}

}
