package pagina1;
import java.util.Scanner;
public class Alg101{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número: ");
int num=leia.nextInt();
if (num>=20 && num<=90) {
System.out.println("O número está compreendido entre 20 e 90");	
}
else {
	System.out.println("O número não está compreendido entre 20 e 90");
}
	}}