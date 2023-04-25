package PaginaQuatro;
import java.util.Scanner;
public class Alg69 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);		
System.out.println("Digite o numerador: ");		
double num = leia.nextDouble();		
System.out.println("Digite o denominador: ");		
double den = leia.nextDouble();
double dec = num/den;	
System.out.printf("A fração em forma de número decimal é igual a: %.2f",dec);	
	}

}
