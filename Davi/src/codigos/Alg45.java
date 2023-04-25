package codigos;
import java.util.Scanner;
public class Alg45 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite um número");
float num = leia.nextFloat();
float quad=num*num;
double raiz= Math.sqrt(num);
System.out.println("número: "+num);
System.out.println("quadrado: "+quad);		
System.out.println("raiz quadrada: "+raiz);		
	}

}