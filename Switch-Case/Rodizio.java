import java.util.*;
public class Rodizio {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int n;
		System.out.println("Escreva o último número da placa do seu veículo ");
		n= leia.nextInt();
		//Começando a estrutura de switch-case
		switch(n){
		   case 1:
		   case 2:
			   System.out.println("Em dias de segunda-feira, seu veículo não poderá circular em SP");
			   break; // sem ele, o case não para de analisar 
		   case 3:
		   case 4:
			   System.out.println("Em dias de terça-feira, seu veículo não poderá circular em SP");
			   break;
		   case 5:
		   case 6: 
			   System.out.println("Em dias de quarta-feira, seu veículo não poderá circular em SP");
			   break;
		   case 7:
		   case 8:
			   System.out.println("Em dias de quinta-feira, seu veículo não poderá circular em SP");
			   break;
		   case 9: 
		   case 0:
			   System.out.println("Em dias de sexta-feira, seu veículo não poderá circular em SP");
			   break;
			   default:
				   System.out.println("Placa inválida");
		}leia.close();
	}
}
