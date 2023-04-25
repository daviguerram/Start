package pagina1;
import java.util.Scanner;
public class Menu5 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("1- Primeira letra de um nome");
System.out.println("2- Última letra de um nome");
System.out.println("3- Letra do meio de um nome");
int x=leia.nextInt();
leia.nextLine();
switch (x) {
case 1:
	System.out.println("Digite um nome: ");
	String num=leia.nextLine();
	char y=num.charAt(0);
	System.out.println("Primeira letra de "+num+": "+y);
	break;
case 2:
	System.out.println("Digite um nome: ");
	num=leia.nextLine();
	y=num.charAt(num.length()-1);
	System.out.println("Última letra de "+num+": "+y);
	break;
case 3:
	System.out.println("Digite um nome: ");
	num=leia.nextLine();
	y=num.charAt(num.length()/2);
	System.out.println("Letra do meio de "+num+": "+y);
	break;
default:
	System.out.println("Caractere inválido");
	return;
	}

}













}