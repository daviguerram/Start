package pagina3;
import java.util.Scanner;
public class Alg60 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Entre com a razão da PA: ");	
	double raz=leia.nextDouble();	
	System.out.println("Entre com o primeiro termo dessa PA: ");	
	double pri=leia.nextDouble();
	double dec = pri+(10-1)*raz;
	System.out.println("O décimo termo da PA será: "+dec);
	
	}

}
