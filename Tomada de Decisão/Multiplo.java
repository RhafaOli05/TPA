import java.util.*;
public class Multiplo {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int n, resto;
		System.out.println("Digite um número inteiro e descubra se ele é multplo de 10");
		n=leia.nextInt();
		resto=n%10;
		if(resto==0) {
			System.out.println("O número "+n+" é multiplo de 10");
		}else {
			System.out.println("O número "+n+" não é multiplo de 10");
		}leia.close();
	}
}
