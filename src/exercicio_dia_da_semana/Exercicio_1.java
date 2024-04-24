package exercicio_dia_da_semana;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		/* Trabalhando com a estrutura condicional SWTICH-CASE, praticando com os dias da semana. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o dia da semana.");
		System.out.println("Domingo [1], Segunda-feira [2], Terça-feira [3], Quata-feira [4], Quinta-feira [5], Sexta-feira [6], Sábado [7].");
		int escolha = sc.nextInt();

		switch (escolha) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Erro: escolha entre 1 até 7.");
			System.out.println("Fim do programa.");
			break;
		}

		sc.close();
	}

}
