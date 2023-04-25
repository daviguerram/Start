package pagina2;
import java.util.Scanner;
public class Alg117 {
	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número: ");
double num=leia.nextDouble();
System.out.println("Digite outro número: ");
double num2=leia.nextDouble();	
System.out.println("Digite outro número: ");
double num3=leia.nextDouble();	
double maior= -Double.MAX_VALUE;
if (num>num2 && num>num3) {
	maior=num;
} else if (num2>num && num2>num3) {
	 maior=num2;
}else if (num3>num && num3>num2) {
	maior=num3;
}
System.out.println(maior);

	
	
	
	
	}}