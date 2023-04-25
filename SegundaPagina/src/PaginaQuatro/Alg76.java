package PaginaQuatro;
import java.util.Scanner;
public class Alg76 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
	System.out.println("Digite um número entre 0 e 60: ");	
	int num=leia.nextInt();
	num= (num+1)%61;
	System.out.println("O sucessor é: "+num);
	}

}
