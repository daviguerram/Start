package PaginaQuatro;
import java.util.Scanner;
public class Alg74 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite o seu salário em R$: ");	
	double sal=leia.nextDouble();	
	System.out.println("Digite o salário mínimo atual em R$: ");
	double min=leia.nextDouble();
	double fim = sal/min;
	System.out.printf("Quantidade de salários mínimos correspondente ao seu salário: %.2f",fim);
	}

}
