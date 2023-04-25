package pagina3;
import java.util.Scanner;

public class Alg64 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
System.out.println("Digite a temperatura em graus centígrados: ");
double grau=leia.nextDouble();
double far= (9*grau+160)/5;

System.out.println("A temperatura em Fahrenheit é de: "+far);
		
	}

}
