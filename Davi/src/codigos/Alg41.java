package codigos;
import java.util.Scanner;
public class Alg41 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite um número");
float num = leia.nextFloat();
System.out.println("Digite outro número");
float num2 = leia.nextFloat();
System.out.println("Digite outro número");
float num3 = leia.nextFloat();
System.out.println("Digite outro número");
float num4 = leia.nextFloat();
float med = (num*1+num2*2+num3*3+num4*4)/(1+2+3+4);


System.out.println(med);
		
		
	}

}