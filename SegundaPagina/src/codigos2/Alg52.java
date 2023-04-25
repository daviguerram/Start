package codigos2;
import java.util.Scanner;
public class Alg52 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite o lado do quadrado em cm: ");
double lado =leia.nextDouble();		
double per = lado*4;
double area = lado*lado;
double dia = Math.sqrt((lado*lado)+ (lado*lado));
System.out.println("Perímetro: "+per);	
System.out.println("Área: "+area);	
System.out.println("diagonal: "+dia);	
	}

}
