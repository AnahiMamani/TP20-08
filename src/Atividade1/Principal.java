package Atividade1;
import java.util.Scanner;
public class Principal {
	 
	public static void main(String[] args) {
		Conta c = new Conta("C", 200);
		
		Conta a = new Conta("A", 200);
		Conta b = new Conta("B", 200);

		Scanner sc = new Scanner(System.in);
		String linha="\n------------------------------------\n";
		String menu ="\n\n---Bem vindo ao sistema bancario---\n 1.-Depositar\n 2.-Sacar\n 3.-Transferir\n 4.-Mostrar Dados\n 5.-Cadastrar\n 0.-Sair\n Selecione a operação desejada."+linha;
		int op=0;
 
		do {
			System.out.print(menu);
			op=sc.nextInt();
			switch(op) {
				case 1:{
					{
						System.out.print("---------------DEPOSITO---------------\nValor que deseja depositar:");
						double v = sc.nextDouble();
						//Ao usar o c.depositar(v) caso o retorno sja true ele faz o que esta no if, se for false ele faz o que esta no else
							if(c.depositar(v)) {
								System.out.print("\n  Deposito efetuado com sucesso!");	
							}else {
								System.out.print("  Opração não realizada!");
							}
							System.out.print(linha);
				break;
					}
				}
				case 2:{
					System.out.print("---------------SAQUE---------------\nValor que deseja Sacar:");
					double v = sc.nextDouble();
						if(c.sacar(v)) {
							System.out.print("\n  Saque efetuado com sucesso!");	
						}else {
							System.out.print("  Opração não realizada, \n  saldo insuficiente!");
						}
						System.out.print(linha);
				break;
				}
				case 3:{
						System.out.print("---------------TRANSFERIR---------------\nValor que deseja Transferir:");
						double v = sc.nextDouble();
						System.out.print("Conta destino:");
						String destino = sc.next();
						
							if(c.transferir(b, v)) {
								System.out.print("\n  Tranferencia efetuado com sucesso!");	
							}else {
								System.out.print("  Opração não realizada, \n  saldo insuficiente!");
							}
							System.out.println("\n C: "+c.getSaldo());
							System.out.println("A: "+a.getSaldo());
							System.out.println("B: "+b.getSaldo());
							
						System.out.print(linha);
				break;
				}
				case 4:{
					System.out.print("-----------DADOS DA CONTA-----------\n");
						System.out.print(c+linha);
				break;
				}
			}
		}while(op!=0);
	}
 
}