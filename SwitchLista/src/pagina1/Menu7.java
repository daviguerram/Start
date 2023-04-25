package pagina1;
import java.util.Scanner;
public class Menu7 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("1 - Parte inteira de um número real");		
System.out.println("2 - Parte fracionária de um número real: ");		
System.out.println("3- O número arrendondado");	
int x=leia.nextInt();
switch (x) {
case 1:
	System.out.println("Digite um número real: ");
	double num=leia.nextDouble();
	int parteInteira=(int)num;
	System.out.println("Parte inteira de "+num+": "+parteInteira);
	break;
case 2: 
	System.out.println("Digite um número real: ");
	num=leia.nextDouble();
	 parteInteira=(int)num;
	double frac=num-parteInteira;
	System.out.println("Parte fracionária de "+num+": "+frac);
	break;
case 3:
	System.out.println("Digite um número real: ");
	 num=leia.nextDouble();
	double arre=Math.round(num);
	System.out.println(num+" arredondado: "+arre);
	break;
default:
	System.out.println("Caractere inválido");
	return;
}

	}

}
