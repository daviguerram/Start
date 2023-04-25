package pagina1;
import java.util.Scanner;
public class Alg92 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número: ");
double num=leia.nextDouble();
System.out.println("Digite outro número: ");
double num2=leia.nextDouble();
double adi=num+num2;
if(adi>20) {
System.out.println(adi+8);
}else if (adi<=20) {
System.out.println(adi-5);	
}
}
	
}