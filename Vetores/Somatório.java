import java.util.*;
public class Somatório {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a[], b[], i, j;
         a = new int[10];
         b = new int[10]; 
        System.out.println("Digite 10 números para o vetor A:");
        for (i= 0; i< 10; i++) { 
            a[i] = leia.nextInt();
        }
        // Calculando o vetor B
        for (i = 0; i < 10; i++) { 
            b[i] = 0;
            for (j = i; j < 10; j++) { // Soma de A[i] até A[9]
                b[i] += a[j]; // Adiciona A[j] ao somatório
            }
        }
        // Mostrar os resultados
        System.out.println("Vetor A:");
        for (i = 0; i < 10; i++) { 
            System.out.print(a[i] + " "); 
        }
        System.out.println();
        System.out.println("Vetor B:");
        for (i = 0; i < 10; i++) { 
            System.out.print(b[i] + " "); 
        }
        System.out.println(); 
        leia.close(); 
    }

}
