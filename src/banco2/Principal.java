package banco2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta c = new Conta(new Cliente("Sirley","111234-5678"),5000);
		Conta outra = new Conta(new Cliente("Debora","111234-5678"),1000);
		ArrayList<Conta> lista= new ArrayList<Conta>();
		lista.add(outra);
		lista.add(c);
		String menu;
		int op = 0;
		double valor;
		menu = "1.Depositar\n2.Scar\n3.Transferir\4.Listar \n5.Criar nova conta \n0.Sair";

		do {
			System.out.println(menu);
			op = sc.nextInt();
			switch (op) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 0: {
				System.out.println("Encerrando o programa");
				break;
			}
			default:
				System.out.println("Opção inválida!\nRetornando ao menu.\n");	
				break;
			}
		} while (op != 0);

	}

}
