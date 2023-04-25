package codigos;
import java.util.Scanner;
public class Alg40 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite um número");
float num = leia.nextFloat();
System.out.println("Digite outro número");
float num2 = leia.nextFloat();
float resul = num/num2;
float rest = num%num2;
System.out.println("Dividendo: " +num);
System.out.println("Divisor: "+num2);
System.out.println("Quociente: "+resul);
System.out.println("resto: "+rest);		
		
	}

}