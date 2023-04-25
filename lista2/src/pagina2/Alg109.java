package pagina2;
import java.util.Scanner;
public class Alg109 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
	System.out.println("Digite um nome: ");	
		String nome=leia.nextLine();
		System.out.println("Digite outro nome:");
	String nome2= leia.nextLine();
	if(nome.compareToIgnoreCase(nome2)<0) {
	System.out.println(nome);
	System.out.println(nome2);	
	} else {
	System.out.println(nome2);
	System.out.println(nome);
	}
	
	
	}

}
