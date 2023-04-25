package codigos2;
import java.util.Scanner;
public class Alg53 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o lado a do paralelepipedo em cm: ");
double a = leia.nextDouble();
System.out.println("Digite o lado b do paralelepípedo em cm: ");
double b = leia.nextDouble();
System.out.println("Digite o lado c do paralelepípedo em cm: ");		
double c = leia.nextDouble();
double dia = (a*a) + (b*b) +(c*c);
System.out.println("A diagonal do paralepípedo mede "+dia+"cm");
	
	}

}
