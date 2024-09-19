import java.util.*;
public class Idade2 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int nasc, atual, idade, i, usuario=10, velho, novo;
		System.out.println("Escreva o ano atual");
		atual=leia.nextInt();
		System.out.println();
		System.out.println("Escreva o ano de nascimento do usuário 1");
		System.out.println();
		nasc=leia.nextInt();
		velho=atual-nasc; //vai receber a idade do 1o usuário
		novo=velho; // também vai receber
		System.out.println("A idade do usuário 1 é: "+velho+" anos");
		System.out.println();
		for(i=2; i<=usuario; i++) {
			System.out.println("Escreva o ano de nascimento do usuário "+i);
			nasc=leia.nextInt();
			idade=atual-nasc;
			System.out.println("A idade do usuário "+i+" é: "+idade+" anos");
			System.out.println();	
			if (idade>velho) { //aqui se compara a idade lida do usuário com a idade do primeiro
				
				//No caso, se essa nova idade é maior que a anterior
				
				velho=idade; //se a condição for verdadeira, a última idade lida será +
				//+ armazenada no "velho"
			}
			if(idade<novo) { //o mesmo acontece com o "novo", mas a comparação é se a +
				//+ nova idade é menor que a anterior
				
				novo=idade;
			}leia.close();
			
	  }
		System.out.println("O usuário mais velho tem "+velho+" anos");
		System.out.println();
		System.out.println("O usuário mais novo tem "+novo+" anos");
	}
}
