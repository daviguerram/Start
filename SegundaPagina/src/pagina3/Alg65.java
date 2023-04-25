package pagina3;
import java.util.Scanner;
public class Alg65 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);	
System.out.println("Digite o valor do raio da lata de óleo em cm: ");
double raio=leia.nextDouble();	
System.out.println("Digite a altura da lata de óleo em cm: ");	
double alt=leia.nextDouble();	
double vol= 3.14159*(raio*raio)*alt;	
System.out.printf("O volume da lata de óleo em centrímetros cúbicos é de: %.2f",vol);
	
	}

}
