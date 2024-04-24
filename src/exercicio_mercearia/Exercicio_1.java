package exercicio_mercearia;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		/*Trabalhando com a estrutura condicional SWTICH-CASE, busca de produto através do código.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o produto desejado informando o código.");
		System.out.println();
		System.out.println("Detergente: código [100]");
		System.out.println("Esponja: código [101]");
		System.out.println("Lã de Aço: código [102]");
		int escolha = sc.nextInt();

		switch (escolha) {

		case 100:
			System.out.println("Produto: Detergente");
			System.out.println("Valor unitário: R$1,59");
			System.out.println("Deseja quantas unidades: ");
			int unidadesDetergente = sc.nextInt();
			
			double valorCarrinho = unidadesDetergente * 1.59;
			
			System.out.println("Total a pagar: " + valorCarrinho);
			break;
		case 101:
			System.out.println("Produto: Esponja");
			System.out.println("Valor unitário: R$4,59");
			System.out.println("Deseja quantas unidades: ");
			int unidadesEsponja = sc.nextInt();
			
			double valorCarrinho2 = unidadesEsponja * 4.59;
			
			System.out.println("Total a pagar: " + valorCarrinho2);
			break;
		case 102:
			System.out.println("Produto: Lã de Aço");
			System.out.println("Valor unitário: R$1,79");
			System.out.println("Deseja quantas unidades: ");
			int unidadesLaDeAco = sc.nextInt();
			
			double valorCarrinho3 = unidadesLaDeAco * 1.79;
			
			System.out.println("Total a pagar: " + valorCarrinho3);
			break;
		default:
			System.out.println("Erro: escolha entre 1 até 3.");
			System.out.println("Fim do programa.");
			break;
		}
		sc.close();
	}

}
