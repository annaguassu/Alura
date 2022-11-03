package bytebankcomposto;

public class Conta {
	private double saldo; //são atributos
	int agencia;
	int numero;
	Cliente titular;
	

	public void deposita(double valor){
	    this.saldo += valor;
	}
	
	public boolean saca(double valor){
	    if(this.saldo >= valor){
	        this.saldo -= valor;
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean transfere(double valor, Conta destino){
	    if(this.saldo >= valor){
	        this.saldo -= valor;
	        destino.deposita(valor);  //reutiliza  
	        return true;
	    }
	    return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
