package pagina2;
import java.util.Scanner;
public class Alg103{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o ano em que você nasceu: ");
int nasc=leia.nextInt();
System.out.println("Digite o ano atual: ");
int ano=leia.nextInt();
if (nasc>ano) {
	System.out.println("Você ainda não nasceu");

} else {
	int idade= ano-nasc;
	System.out.println("Você tem ou fará "+idade+" anos esse ano");
}

}}