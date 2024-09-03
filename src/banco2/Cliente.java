package banco2;

public class Cliente {
	
	private String nome;
	private String celular;
	
	//construction
	public Cliente(String nome,String celular) {
		this.nome=nome;
		this.celular=celular;
	}
	
	//gets and setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", celular=" + celular + "]";
	}
}
