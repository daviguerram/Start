package codigos2;
import java.util.Scanner;
import java.lang.Math;
public class Alg51 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite o raio do círculo em cm: ");		
double raio = leia.nextDouble();
double per = 2*Math.PI*raio;
double are = Math.PI * (raio*raio); 
System.out.println("Perímetro: "+per+"cm");
System.out.println("Área: "+are+"cm");	
	}

}
