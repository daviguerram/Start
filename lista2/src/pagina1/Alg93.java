package pagina1;
import java.util.Scanner;
public class Alg93 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número: ");
double num=leia.nextDouble();
if (num>0) {
System.out.println(Math.sqrt(num));
}else if (num<0) {
System.out.println(Math.pow(num, 2));
}
	}	
}