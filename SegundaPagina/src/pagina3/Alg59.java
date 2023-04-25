package pagina3;
import java.util.Scanner;
public class Alg59 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite o valor do cateto oposto em cm: ");		
double opo = leia.nextDouble();		
System.out.println("Digite o valor do cateto adjacente em cm: ");		
double adj = leia.nextDouble();	
double hip = Math.sqrt((adj*adj)+(opo*opo));	
System.out.printf("A hipotenusa do triângulo retângulo mede, em cm: %.2f",hip);	
	}

}
