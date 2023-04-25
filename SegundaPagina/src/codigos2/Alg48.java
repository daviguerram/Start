package codigos2;
import java.util.Scanner;
public class Alg48 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Quantos quilowatts você utilizou?");
	double kil = leia.nextDouble();
	double val = kil*1.73;
	System.out.println("O valor de um quilowatt em R$ é 1.73");	
	System.out.println("O valor a ser pago em R$ é de: "+val);	
	double desc = val/100;
	double nov = desc*10;
	double novo = val-nov;
	System.out.println("O novo valor a ser pago por essa residência com o desconto em reais é de: "+novo);
	
	}

}
