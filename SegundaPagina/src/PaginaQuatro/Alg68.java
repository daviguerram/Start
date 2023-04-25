package PaginaQuatro;
import java.util.Scanner;
public class Alg68 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
double a,b,aux;
System.out.println("Digite o valor da variável A: ");
		 a = leia.nextDouble();
		System.out.println("Digite o valor da variável B: ");
	 b = leia.nextDouble();
	aux = a;
	a=b;
	b=aux;
	System.out.println("A váriavel A é igual a:"+a);
	System.out.println("A variável B é igual a: "+b);
	}

}
