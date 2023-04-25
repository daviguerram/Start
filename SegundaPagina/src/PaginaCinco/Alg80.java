package PaginaCinco;
import java.util.Scanner;
public class Alg80 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	double fit= leia.nextDouble();	
	System.out.println("Digite em R$ o valor cobrado por aluguel: ");
	double val = leia.nextDouble();
    double ter= (((fit/3)*val)*12);
	System.out.println("O faturamento anual da locadora em R$ é de: "+ter);
	double x = ((fit/3)/100)*10;
	double y= ((x*val)/100)*10;
	System.out.println("O valor ganho por mês em multas é de: "+y);
	double per = (fit/100)*2;
	double rep = (fit/100)*10;
	fit=fit-per+rep;
	System.out.println("O locadora terá um total de: "+fit+" fitas no final do ano.");
	}

}
