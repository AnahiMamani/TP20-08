package Atividade1;
public class Conta {
	
	//ATRIBUTOS
		//this atribut are from for all the objects because they are not static
		private int nConta;
		private String titular;
		private double saldo;
		//static diz que o atibuto ou o metodo é da classe, chame entao com o nome da classe, isso faz com que toda a classe o vejam!
		public static int quanContas=0;
		
		
	//INSTANCIA
		public Conta (String titular, double saldo) {
			this.titular=titular;
			this.saldo=saldo;
			Conta.quanContas++;
		}
		
	//SET AND GET
		//nConta
		public int getNConta() {
			return this.nConta;
		}
		//titular
		public String getTitular() {
			return this.titular;
		}
		public void setTitular(String titular) {
			this.titular=titular;
		}
		//saldo
		public double getSaldo() {
			return this.saldo;
		}
		
	//METODOS
		@Override
		public String toString() {
			return  "\nNome do titular: "+this.titular+"\nNúmero da conta: "+this.nConta+ "\nSaldo: "+this.saldo;
		}
		public boolean sacar(double valor) {
			if(this.saldo>=valor) {
				this.saldo-=valor;
				return true;
			}else {
				return false;
			}
		}
		public boolean depositar(double valor) {
			if(valor>0) {
				this.saldo+=valor;
				return true;
			}else {
				return false;
			}
		}
		public boolean transferir(Conta destino, double valor) {
			if (sacar(valor)) {
				destino.depositar(valor);
				return true;
				} else {
					return false;        
				}
			} 
}