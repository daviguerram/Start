package pagina1;
import java.util.Scanner;
public class Menu3 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("De qual forma geométrica você deseja descobrir a área? ");
System.out.println("1 - Área de um retângulo");	
System.out.println("2 - Área de uma circunferência");	
System.out.println("3 - Área de um triângulo");	
int x=leia.nextInt();
switch (x) {
case 1: 
	System.out.println("Digite a altura e a largura do retângulo em cm, respectivamente:  ");
	double alt=leia.nextInt();
	double larg=leia.nextInt();
	double area=alt*larg;
	System.out.println("Área do retângulo: "+area);
    break;
case 2:
	System.out.println("Digite o raio da circunferência: ");
	double raio= leia.nextDouble();
	double rai=3.14*(raio*raio);
	System.out.println("Área da circunferência: "+rai);
	break;
case 3:
	System.out.println("Digite a base e a altura do triângulo em cm, respectivamente: ");
	double base=leia.nextDouble();
	 alt=leia.nextDouble();
	area=(base*alt)/2;
	System.out.println("Área do triângulo: "+area);
	break;
default:
	System.out.println("Caractere inválido");
}
	
	
	
	}

}
