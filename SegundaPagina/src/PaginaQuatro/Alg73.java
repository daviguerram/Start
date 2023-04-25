package PaginaQuatro;
import java.util.Scanner;
public class Alg73 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);	
	System.out.println("Digite um número: ");
	double num=leia.nextDouble();
	double inte= (int)num;
	double frac = num-inte;
	double arren= Math.round(num);
	System.out.println("A parte inteira do número: "+inte);
	System.out.println("A parte fracionária do número: "+frac);
	System.out.println("O número arredondado: "+arren);
	
	}

}
