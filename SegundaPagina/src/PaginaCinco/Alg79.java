package PaginaCinco;
import java.util.Scanner;
public class Alg79 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite o valor de aplicação mensal em R$: ");	
	double apli=leia.nextDouble();	
	System.out.println("Digite o valor da taxa: ");
	double taxa=leia.nextDouble();
	System.out.println("Digite o número de meses ");
	double mes=leia.nextDouble();
	double val= apli *(Math.pow((1+taxa),mes) -1)/taxa;
	System.out.printf("Seu rendimento em R$ será de: %.2f",val);
	}

}
