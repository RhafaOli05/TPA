import java.util.*;
public class VetorDiferenca {
	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);

	    int a[],b[],c[],i;
	    a=new int[10];
	    b=new int[10];
	    c=new int[10];
	    
	    for (i=0 ; i<10 ; i++) {
	    	System.out.println("Digite o " +(i+1)+ "° número de A");
	    	a[i]=ler.nextInt();
	    }
	    for (i=0 ; i<10 ; i++) {
	    	System.out.println("Digite o " +(i+1)+ "° número de B");
	    	b[i]=ler.nextInt();
	    	}
	    for (i=0 ; i<10 ; i++)
	    	if (a[i]!=b[i]) {
	    		c[i]=a[i];
	    	}
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
