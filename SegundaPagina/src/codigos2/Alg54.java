package codigos2;
import java.util.Scanner;
public class Alg54 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite o comprimento da base do triângulo em cm ");
double base = leia.nextDouble();		
System.out.println("Digite a altura do triângulo em cm: ");		
double alt = leia.nextDouble();	
double area = (base*alt)/2;	
System.out.println("Área do triângulo: "+area+"cm");	
	}

}
