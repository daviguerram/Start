package pagina3;
import java.util.Scanner;
public class Alg61 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite a razão da PG: ");
double raz=leia.nextDouble();
System.out.println("Digite o primeiro termo da PG: ");
double pri=leia.nextDouble();		
double cin=	pri*Math.pow(raz,4);	
System.out.printf("O quinto termo da PG será: %.2f",cin);
		
	}

}
