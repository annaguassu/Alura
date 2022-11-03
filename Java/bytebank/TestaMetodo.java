package bytebank;

public class TestaMetodo {

		public static void main(String[] args) {
			Conta contaDoPaulo = new Conta(); //criando uma nova conta
			contaDoPaulo.saldo = 100;
			contaDoPaulo.deposita(50); //depositando
			System.out.println(contaDoPaulo.saldo);
			
			boolean conseguiuRetirar = contaDoPaulo.saca(20); //como o método tem retorno boolean, guarda pra ver se é true ou false
			System.out.println(contaDoPaulo.saldo);
			System.out.println(conseguiuRetirar);
			
			Conta contaDaMarcela = new Conta();
			contaDaMarcela.deposita(1000);
			if(contaDaMarcela.transfere(300, contaDoPaulo)){
				System.out.println("Transferencia com sucesso!");
			}else {
				System.out.println("faltou dinheiros");
			}
			System.out.println(contaDaMarcela.saldo);
			System.out.println(contaDoPaulo.saldo);

			contaDoPaulo.titular = "Paulo Silveira";
			System.out.println(contaDoPaulo.titular);
		}
}
