import java.util.*;
public class Futebol {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int nasc, idade;
		System.out.println("Escreva aqui o ano de nascimento do aluno: ");
		nasc= leia.nextInt();
		idade= 2024-nasc;
		if(idade <= 6) {
			System.out.println("Este aluno será do grupo Dente de Leite");
		}else if(idade <= 10) {
			System.out.println("Este aluno será do Infantil I");
		}else if(idade <= 14) {
			System.out.println("Este aluno será do Infantil II");
		}else if(idade <= 16) {
			System.out.println("Este aluno será do Juvenil I");
		}else if(idade <=17) {
			System.out.println("Este aluno será do Juvenil II");
		}else {
			System.out.println("A escola não permite alunos com mais de 18 anos!");
		}leia.close();
	}
}
