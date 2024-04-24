package exercicio_hotel;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		/*Trabalhando com a estrutura condicional SWTICH-CASE, recpção de um hotel.*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Bem-vindo a recepção do nosso hotel, escolha abaixo a opção que você deseja."); 
		System.out.println("Fazer check-in [1], Chamar o serviço de quarto [2], Restaurante[3]. ");
		int escolha = sc.nextInt();
		
		switch (escolha) {
		
		case 1:
			System.out.println("Para efetuar o seu check-in iremos precisar de alguns dados.");
			System.out.print("Nome completo: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Número para contato: ");
			sc.nextLine();
			String numero = sc.nextLine();
			System.out.println();
			System.out.println(nome + ", obrigado pela nossa escolha! tenha uma excelente estadia.");
			System.out.println("Contato: " + numero);
			System.out.println("Email: " + email);
			break;
		case 2:
			System.out.println("Dentro de 30 minutos nossos funcionários estarão indo efetuar o seu serviço de quarto. ");
			break;
		case 3:
			System.out.println("Escolha qual refeição você deseja. ");
			System.out.println("Café da manhã [1], Almoço [2], Jantar [3]");
			int refeicao = sc.nextInt();
			if (refeicao == 1) {
				System.out.println("Café da manhã");
			}
			else if (refeicao == 2) {
				System.out.println("Almoço");
			}
			else if (refeicao == 3) {
				System.out.println("Jantar");
			}
			else {
				System.out.println("Erro: opção escolhida inválida.");
			}
			break;
		default:
			System.out.println("Erro: escolha entre 1 até 3.");
			System.out.println("Fim do programa.");
			break;
		}
		
		sc.close();
	}

}
