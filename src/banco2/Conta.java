package banco2;

//import Atividade1.Conta;

public class Conta {
	private static int totalContas = 0;
	private Cliente titular;
	private int nConta;
	private double saldo;

	public Conta(Cliente titular, double saldo) {
		totalContas++;
		this.titular = titular;
		this.nConta = totalContas;
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public int getnConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", nConta=" + nConta + ", saldo=" + saldo + "]";
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
