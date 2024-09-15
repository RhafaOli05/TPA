import java.util.*;
public class Nota {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int mb, b, r, i, totalAlunos, nota;
		double porc;
		System.out.println("Digite a quantidade total de alunos");
		totalAlunos=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou I");
		i=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou R");
		r=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou B");
		b=leia.nextInt();
		System.out.println("Digite a quatidade de alunos que tirou MB");
		mb=leia.nextInt();
		System.out.println("Digite a nota para ser verificada: 1-I, 2-R, 3-B, 4-MB");
		nota=leia.nextInt();
		switch (nota){
		case 1:
			porc= i/totalAlunos*100;
			System.out.println("Há "+porc+"% de alunos com I");
			break;
		case 2:
			porc= r/totalAlunos*100;
			System.out.println("Há "+porc+"% de alunos com R");
			break;
		case 3:
			porc= b/totalAlunos*100;
			System.out.println("Há "+porc+"% de alunos com B");
			break;
		case 4:
			porc= mb/totalAlunos*100;
			System.out.println("Há "+porc+"% de alunos com MB");
			break;
		}leia.close();
		
	}
}
