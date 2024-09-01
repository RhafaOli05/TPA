import java.util.*;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int nasc, ano;
		System.out.println("Escreva seu ano de nascimento");
		nasc=leia.nextInt();
		ano=nasc%4;
		if(ano==0) {
			System.out.println("O ano de "+nasc+" é bissexto");
		}else {
			System.out.println("O ano de "+nasc+" não é bissexto");
		}leia.close();
	}
}
