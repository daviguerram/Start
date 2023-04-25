package pagina2;
import java.util.Scanner;
public class Alg115 {
	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número:");
double num=leia.nextDouble();
System.out.println("Digite outro número: ");
double num2=leia.nextDouble();
if (num>num2) {
	System.out.println(Math.pow(num2, 2));
	System.out.println(Math.sqrt(num));
} else if(num2>num) {
	System.out.println(num*num);
	System.out.println(Math.sqrt(num2));
} else {
	System.out.println(num*num);
	System.out.println(Math.sqrt(num));
}


}}
