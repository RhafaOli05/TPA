import java.util.*;
public class VetorPotencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int [11];
		
		//Lendo o vetor A e calculando a potência
		System.out.print("A =[");
		for(i=0;i<11;i++) {
			a[i] = (int)Math.pow(2,i);
			System.out.print(a[i]+" ");
		}
		System.out.print("]");

		ler.close();
	}

}


