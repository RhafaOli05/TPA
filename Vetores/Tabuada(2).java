import java.util.*;
public class Tabuada {

	public static void main(String[] args) {
		    Scanner leia = new Scanner (System.in);
	        int i,n=0,r,p;
	        int a[] = new int [5];
	        
	        for(i=0;i<5;i++){
	            System.out.println("Digite o "+(i+1)+"° número");
	            a[i]=leia.nextInt();
	        }
	        
	        for(i=0;i<5;i++){
	        	System.out.println(" ");
	            System.out.println("Tabuada do "+a[i]+" :");
	            for(p=0;p<10;p++){
	                r=a[n]*p;
	                System.out.println(a[n]+"×"+p+"="+r);
	            }
	            n++;
			leia.close();
	        }
	}

}
