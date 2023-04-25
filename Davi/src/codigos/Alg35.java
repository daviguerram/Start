package codigos;
import java.util.Scanner;
public class Alg35 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
System.out.println("Escreva seu nome");
String nome = leia.nextLine();
System.out.println("Escreva seu endereço");
String end = leia.nextLine();
System.out.println("Escreva seu telefone");
String tel = leia.nextLine ();

System.out.println(nome+("  ") + end +("   ") + tel);
		
	}

}
