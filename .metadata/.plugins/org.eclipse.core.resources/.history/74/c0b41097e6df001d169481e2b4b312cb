package pagina1;
import java.util.Scanner;
public class Menu1 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Você deseja converter de C° para F° ou de F° para C°?");
System.out.println("1 - C° para F°");		
System.out.println("2 - F° para C°");		
int x = leia.nextInt();
switch (x) {
case 1: 
	System.out.println("Digite uma temperatura em graus celsius: ");
	int temp = leia.nextInt();
	double grau= (9*temp+160)/5;
	System.out.println("Temperatura em C°: "+temp);
	System.out.println("Temperatura em F°: "+grau);
	break;
case 2:
	System.out.println("Digite uma temperatura em graus fahrenheit: ");
	temp=leia.nextInt();
	grau=(5*temp-160)/9;
	System.out.println("Temperatura em F°: "+temp);
	System.out.println("Temperatura em C°: "+grau);
	break;
default:
	System.out.println("Caractere inválido");
	return;
}
	}

}
