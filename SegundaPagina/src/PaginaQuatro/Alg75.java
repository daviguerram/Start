package PaginaQuatro;
import java.util.Scanner;
public class Alg75 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite o seu peso em Kg, de forma arredondada: ");	
	double peso = leia.nextDouble();	
	double gram = peso*100;	
	double por = (gram/100)*12;
	double novo = gram+por;
	System.out.println("Seu peso em gramas é de: "+gram);
	System.out.printf("Caso você engorde 12%%, seu peso em gramas será de: %.2f",novo);
	}

}
