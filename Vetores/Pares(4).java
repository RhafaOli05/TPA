import java.util.*;
public class Pares {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a[], n, i, j;
		a = new int [10];
        for(i= 0; i< 10; i++) {
        	System.out.println("Digite o "+(i+1)+"º número de A");
            a[i] = leia.nextInt();
        }
        for(i=0;i<10;i++) {
            n = a[i];
            System.out.println();
            System.out.print("Os pares de 0 até " + n + " são: [");
            for (j=0;j<=n;j+=2) {
            	System.out.print(j+" ");
            }
            System.out.println("]\n");
        }
        
        leia.close();
	}
}
