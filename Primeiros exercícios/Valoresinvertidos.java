import java.util.Scanner;
public class ValoresInvertidos {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int valorA, valorB, c;
		System.out.println("Digite o valor A");
		valorA= leia.nextDouble();
		System.out.println("Digite o valor B");
		valorB= leia.nextDouble();
		c=valorA;
		valorA= valorB;
		valorB= c;
		System.out.println("O valor A agora é: " +valorA);
		System.out.println("O valor B agora é: " +valorB);
	}leia.close();

}
