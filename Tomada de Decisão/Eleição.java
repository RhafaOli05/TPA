import java.util.*;
public class Eleição {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int eleicao, nascimento, idade;
		System.out.println("Escreva o ano da próxima eleição");
		eleicao=leia.nextInt();
		System.out.println("Agora escreva o ano de seu nascimento");
		nascimento=leia.nextInt();
		idade= eleicao-nascimento;
		System.out.println("Você terá " +idade+ " anos, então");
		if(idade<16) {
			System.out.println("infelizmente não poderá votar");
		}else {
			System.out.println("poderá votar");
		}leia.close();
	}
}
