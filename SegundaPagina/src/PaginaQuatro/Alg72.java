package PaginaQuatro;
import java.util.Scanner;
public class Alg72 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
	System.out.println("Digite o valor depositado em R$: ");	
double valor = leia.nextDouble();		
	System.out.println("Digite a o valor em porcentagem da taxa de juros: ");
	double tax=leia.nextDouble();
	System.out.println("Quantos meses você pretende não retirar o dinheiro? ");
	double mes = leia.nextDouble();
	double por = (valor/100)*tax;
	double fim = valor+(por*mes);
	System.out.println("O dinheiro renderá, em R$: "+por+" por mês");
	System.out.printf("Ao fim do investimento, você terá, em R$: %.2f",fim);
	
	}

}
