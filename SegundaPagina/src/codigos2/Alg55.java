package codigos2;
import java.util.Scanner;
public class Alg55 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o valor da diagonal menor do losango em cm:");		
double menor = leia.nextDouble();		
System.out.println("Digite o valor da diagonal maior do losango em cm:");		
double maior=leia.nextDouble();	
double area = (menor*maior)/2;	
	System.out.println("A área do losango vale: "+area+"cm");
	
}

}
