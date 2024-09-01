import java.util.*;
public class Peixe {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		double peixe;
		System.out.println("Escreva o peso do peixe pescado (em quilogramas)");
		peixe= leia.nextDouble();
		if(peixe <= 3) {
			System.out.println("O preço a ser pago será R$ 25,00");
		}else if (peixe >3 && peixe <= 5) {
			System.out.println("O preço a ser pago será R$ 24,00");
		}else if (peixe >5 && peixe <=10) {
			System.out.println("O preço a ser pago será R$ 23,00");
		}else {
			System.out.println("O preço será R$ 20,00 e será cobrada uma taxa adicional de R$ 30,00. Dando um total de R$ 50,00 para serem pagos");
		}leia.close();
	}
}
