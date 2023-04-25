package pagina2;
import java.util.Scanner;
public class Alg107{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu nome completo em letras maiúsculas:");
String nome=leia.nextLine();
String[] parte= nome.split(" ");
if (parte[0].equals("JOSE")) {
System.out.println(nome);	
}


}}