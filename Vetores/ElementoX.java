import java.util.*;
public class ElementoX {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a[],x,i;
		a= new int [10];
		for (i=0;i<10;i++) {
			System.out.println("Digite o valor do " +(i+1)+ "� n�mero de A");
			a[i]=leia.nextInt();
		}
		System.out.println("Digite o valor que voc� est� procurando");
		x=leia.nextInt();
		for (i=0;i<10;i++) {
		   if (x==a[i]) {
			System.out.println(x+" est� armazenado na posi��o " +a[i]+ " de 'A'");
		   }
		}
		leia.close();
	}
}
