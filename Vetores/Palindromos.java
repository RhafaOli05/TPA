import java.util.*;
public class Palindromos {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[], i;
		a = new int [10];
		for(i=0; i<10; i++) {
			System.out.println("Escreva o "+(i+1)+"º número do vetor A");
			a[i]=leia.nextInt();	
		}
		if(a[0]==a[9] && a[1]==a[8] && a[2]==a[7] && a[3]==a[6] && a[4]==a[5]) {
			System.out.println("É Palíndromo");
		}else {
			System.out.println("Não é Palíndromo");
		}
		leia.close();
	}

}
