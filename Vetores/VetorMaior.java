import java.util.*;
public class VetorMaior {
	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		

		int a[],b[],c[],i,di=1; 
		a=new int[10];
		b=new int[10];
		c=new int[10];
		
		//Lendo A e B
		for (i=0 ; i<10 ; i++) {
			System.out.println("digite o valor do " +(i+1)+ "° número de A");
			a[i]= ler.nextInt();
			}
		for (i=0 ; i<10 ; i++) {
			System.out.println("digite o valor do " +(i+1)+ "° número de B");
			b[i]= ler.nextInt();
			}
		
		//Fazendo o cálculo e a comparação
		for (i=0; i<10 ; i++) {
			if (a[i]>b[i])
				c[i]=1;
		}
		for (i=0; i<10 ; i++) {
			if (a[i]==b[i])
				c[i]=0;
	}
		for (i=0; i<10 ; i++) {
			if (a[i]<b[i])
				c[i]=-1;
	}
		
		//Apresentando A, B e C
		System.out.print("A = [");
		for (i=0; i<10;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]\n");
		
		System.out.print("B = [");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");
		
		
		System.out.print("C = [");
		for (i=0; i<10;i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]\n");

		ler.close();
	}

}
