package Atividade1;

public class Cliente {
	
	//Encanpsulamento, onde vamos deixar como privado os dados da classe
	//ATRIBUTOS
			private String nome;
			private String cpf;
			private String email;
			private int celular;
	
	//INSTANCIA	
			public Cliente(String nome,String cpf,String email,int celular) {
				this.nome=nome;
				this.cpf=cpf;
				this.email=email;
				this.celular=celular;
			}
			//SOBRECARGA - Aqui podemos reescrever algum metodo ja escrito, dependendo da entrada que for inserida ele vai escolher qual se adequa melhor ao uso.
			public Cliente(String nome,String email) {
				this.nome=nome;
				this.email=email;
			}
			public Cliente() {}
	
	//GET AND SET
			//name
			public String getNome() {
				return this.nome;
			}
			public void setNome(String nome) {
				this.nome=nome;
			}
			//cpf
			public String getCpf() {
				return this.cpf;
			}
			//email
			public String getEmail() {
				return this.email;
			}
			public void setEmail(String email) {
				this.email=email;
			}
			//smartphone
			public int getCelular() {
				return this.celular;
			} 
			public void setCelular(int celular) {
		this.celular=celular;
	}

	//METODOS
		//Ao chamar somente o cl vamos ver o caminho de memoria(ja que é um ponteiro),para reescrevelo devemos usar o metodo abaixo onde substituimos a exibição do caminho para a exibição dos dados
		@Override
		public String toString() {
			return  "\nNome: "+this.nome+"\nCPF: "+this.cpf+ "\nEmail: "+this.email+ "\nContato: "+this.celular;	
		}
}

