package pagina1;
import java.util.Scanner;
public class Menu2 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Você deseja converter de Real para Dólar ou de Dólar para Real?");
System.out.println("1 - Real para Dólar");		
System.out.println("2 - Dólar para Real");		
int x = leia.nextInt();
switch (x) {
case 1: 
	System.out.println("Digite uma quantia de dinheiro em reais: ");
	int din = leia.nextInt();
	double dol= din/5;
	System.out.println("Quantia de dinehiro em reais: R$"+din);
	System.out.println("Quantia de dinheiro em dólares: $"+dol);
	break;
case 2:
	System.out.println("Digite uma quantia de dinheiro em dólares: ");
	din=leia.nextInt();
	dol=din*5;
	System.out.println("Quantia de dinheiro em dólares: $"+din);
	System.out.println("Quantia de dinheiro em reais: R$"+dol);
	break;
default:
	System.out.println("Caractere inválido");
	return;
}
	}

}
