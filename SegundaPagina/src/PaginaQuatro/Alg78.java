package PaginaQuatro;
import java.util.Scanner;
public class Alg78 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite o número de lados do polígono: ");	
	double lad= leia.nextDouble();	
	double dia= lad*(lad-3)/2;
	System.out.println("O polígono possui: "+dia+" diagonais.");
	}

}
