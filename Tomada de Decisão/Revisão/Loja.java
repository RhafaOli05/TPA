import java.util.*;
public class Loja {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double compra, cash;
		System.out.println("Escreva o valor de sua compra");
		compra= leia.nextDouble();
		if(compra<= 100.00) {
			cash= (compra/100)*5;
			System.out.println("O valor do cashback será de R$" +cash);
		}else if(compra <= 1000.00) {
			cash= (compra/100)*8;
			System.out.println("O valor do cashback será de R$" +cash);
		}else if(compra <= 2000.00) {
			cash= (compra/100)*10;
			System.out.println("O valor do cashback será de R$" +cash);
		}else if(compra <= 5000.00) {
			cash= (compra/100)*12.5;
			System.out.println("O valor do cashback será de R$" +cash);
		}else {
			cash= (compra/100)*15;
			System.out.println("O valor do cashback será de R$" +cash);
		}leia.close();
	}
}
