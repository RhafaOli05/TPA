import java.util.*;
public class Dívida {
	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		double salario, divida, valorFinal;
		System.out.println("Escreva o valor do seu salário");
		salario=leia.nextDouble();
		System.out.println("Escreva o valor total e suas dívidas");
		divida=leia.nextDouble();
		valorFinal= salario-divida;
		if(valorFinal<0){
			System.out.println("Vão faltar R$"+valorFinal);
		}else if(valorFinal>0) {
			System.out.println("Vão sobrar R$"+valorFinal);
		}else {
			System.out.println("Não vai sobrar ou faltar nada");
		}leia.close();
	}
}
