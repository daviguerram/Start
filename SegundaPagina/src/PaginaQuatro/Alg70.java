package PaginaQuatro;
import java.util.Scanner;
public class Alg70 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);		
System.out.println("Digite o valor do que foi gasto em R$: ");		
double val = leia.nextDouble();		
double gar= (val/100)*10;		
double tot= val+gar;	
System.out.printf("O valor total com a taxa de serviço em R$ é igual a: %.2f",tot);	
	
	}

}
