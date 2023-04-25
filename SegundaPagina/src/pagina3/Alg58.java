package pagina3;
import java.util.Scanner;
public class Alg58 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
double xnum1= leia.nextDouble();
System.out.println("Digite o segundo número: ");		
double xnum2= leia.nextDouble();		
System.out.println("Digite o terceiro número: ");	
double xnum3=leia.nextDouble();	
double x = (xnum1 + (xnum2/(xnum3+xnum1))+2*(xnum1-xnum2)+(Math.log(64)/Math.log(2)));	
System.out.printf("x: %.2f",x);	
	}

}
