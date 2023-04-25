package pagina2;
import java.util.Scanner;
public class Alg104{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu nome");
String nome=leia.nextLine();
System.out.println("Digite seu sexo");
String sexo=leia.nextLine();
System.out.println("Digite sua idade");
int idade=leia.nextInt();	
if (sexo.equals("Feminino") && idade<25) {
	System.out.println("ACEITA");
} else {
	System.out.println("NÃO ACEITA");
}
	}}