import java.util.*;
public class Inss {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		double renda, inss;
		System.out.println("Escreva aqui o valor de sua renda: ");
		renda= leia.nextDouble();
		if(renda <= 1412.00) {
			inss= (renda/100)*7.5;
			System.out.println("O valor que irá recolher de INSS é R$ "+inss);
		}else if(renda <= 2666.68) {
			inss= (renda/100)*9;
			System.out.println("O valor que irá recolher de INSS é R$ "+inss);
		}else if(renda <= 4000.03) {
			inss= (renda/100)*12;
			System.out.println("O valor que irá recolher de INSS é R$ "+inss);
		}else if(renda <= 7786.02) {
			inss= (renda/100)*14;
			System.out.println("O valor que irá recolher de INSS é R$ "+inss);
		}else{
			inss=(renda/100)*16;
			System.out.println("O valor que irá recolher de INSS é R$ "+inss);
		}leia.close();
	}
}
