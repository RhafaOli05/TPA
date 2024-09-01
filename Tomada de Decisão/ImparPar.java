import java.util.*;
public class ImparPar {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero, resto;
		System.out.println("Digite um número inteiro, para saber se ele é par ou ímpar");
		numero=leia.nextInt();
		resto= numero%2;
		if(resto==0) {
			System.out.println("O número "+numero+" é Par");
		}else {
			System.out.println("O número "+numero+" é ímpar");
		}leia.close();
	}
}
