package pagina1;
import java.util.Scanner;
public class Menu8 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("1 - Todas maiúscula");
System.out.println("2 - Todas minúsculas");		
int x=leia.nextInt();
leia.nextLine();
switch (x) {
case 1:
	System.out.println("Digite um palavra: ");
	String nome=leia.nextLine();
	String mai=nome.toUpperCase();
	System.out.println(mai);
	break;
case 2:
	System.out.println("Digite uma palavra: ");
	nome=leia.nextLine();
	mai=nome.toLowerCase();
	System.out.println(mai);
	break;
default:
	System.out.println("Caractere inválido");
	return;
}
		
	}

}
