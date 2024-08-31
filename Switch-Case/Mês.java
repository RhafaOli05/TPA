import java.util.*;
public class Mes {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int dia;
		System.out.println("Escreva aqui um número inteiro, referente é um dos meses do ano, para saber quantos dias ele possui");
		dia=leia.nextInt();
		switch (dia) {
			case 2:
				System.out.println("Esse mês possui 28 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Esse mês possui 30 dias");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Esse mês possui 31 dias");
				break;
			default:
				System.out.println("Este mês é inválido");
		}leia.close();
	}

}
