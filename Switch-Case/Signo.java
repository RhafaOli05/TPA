import java.util.*;
public class signo {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int mes, dia;
		System.out.println("Escreva o seu m�s de nascimento em n�meros:");
		mes= leia.nextInt();
		System.out.println("Escreva seu dia de nascimento");
		dia=leia.nextInt();
		switch (mes) {
			case 3:
				if(dia<21) {
					System.out.println("O seu signo � de Peixes");
			}else {
				System.out.println("O seu signo � de �ries");
			}
				break;
			case 4:
				if(dia<21) {
					System.out.println("O seu signo � de �ries");
				}else {
				System.out.println("O seu signo � de Touro ");
			}
				break;
			case 5: 
				if(dia<22) {
					System.out.println("O seu signo � de Touro");
				}else {
					System.out.println("O seu signo � de G�meos ");
				}
				break;
			case 6:
				if(dia<21) {
					System.out.println("O seu signo � de G�meos");
				}else {
					System.out.println("O seu signo � de C�ncer");
				}
				break;
			case 7:
				if(dia<23) {
					System.out.println("O seu signo � de C�ncer");
				}else {
					System.out.println("O seu signo � de Le�o");
				}
				break;
			case 8:
				if(dia<23) {
					System.out.println("O seu signo � de Le�o");
				}else {
					System.out.println("O seu singno � de Virgem");
				}
				break;
			case 9:
				if(dia <23) {
					System.out.println("O seu signo � de Virgem");
				}else {
					System.out.println("O seu signo � de Libra");
				}
				break;
			case 10:
				if(dia <23) {
					System.out.println("O seu signo � de Libra");
				}else {
					System.out.println("O seu signo � de Escorpi�o");
				}
				break;
			case 11:
				if(dia <22) {
					System.out.println("O seu signo � de Escorpi�o");
				}else {
					System.out.println("O seu signo � de Sagit�rio");
				}
				break;
			case 12:
				if(dia<22) {
					System.out.println("O seu signo � de Sagit�rio");
				}else {
					System.out.println("O seu signo � de Capric�rnio");	
				}
				break;
				case 1:
					if(dia<21) {
						System.out.println("O seu signo � de Capric�rnio");
					}else {
						System.out.println("O seu signo � de Aqu�rio");
					}
					break;
				case 2:
					if(dia<19) {
						System.out.println("O seu signo � de Aqu�rio");
					}else {
						System.out.println("O seu signo � de Peixes ");
					}
					break;
					default:
						System.out.println("M�s ou dia inv�lidos");
		}leia.close();
				
	}
}
