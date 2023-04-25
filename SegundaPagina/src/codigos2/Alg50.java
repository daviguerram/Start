package codigos2;
import java.util.Scanner;
public class Alg50 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Digite a altura do retângulo em cm: ");
double alt = leia.nextDouble();
System.out.println("Digite a base do retângulo em cm:");
double bas = leia.nextDouble();
double per = (alt*2) + (bas*2);
double are = alt*bas;
double dia = Math.sqrt(alt*2 +bas*2);
System.out.println("Perímetro: "+per+"cm");
System.out.println("Área: "+are+"cm");
System.out.println("Diagonal: "+dia+"cm");
	}

}


