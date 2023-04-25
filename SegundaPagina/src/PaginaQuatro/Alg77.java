package PaginaQuatro;
import java.util.Scanner;
public class Alg77 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite um número: ");	
	double num1=leia.nextDouble();	
	System.out.println("Digite outro número: ");
	double num2=leia.nextDouble();
	double fim= (num1-num2)*(num1-num2);
	double fim2= (num1*num1)-(num2*num2);
	System.out.println("O quadrado da diferença entre os dois números é de: "+fim);
	System.out.println("A diferença do quadrado dos dois números é de: "+Math.abs(fim2));
	
	}

}
