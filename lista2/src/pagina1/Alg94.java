package pagina1;
import java.util.Scanner;
public class Alg94 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número: ");
double num=leia.nextDouble();
if (num%3==0) {
System.out.println("É múltiplo de 3");
}else { 
	System.out.println("Não é múltiplo de 3");
}
	}
}