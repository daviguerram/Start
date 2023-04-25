package pagina5;
import java.util.Scanner;
public class Alg137 {
public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite três valores inteiros: ");	
int a=leia.nextInt();	
int b=leia.nextInt();	
int c=leia.nextInt();	
double delta=(b*b)-(4*(a*c));
double x=((-b+Math.sqrt(delta)/(2*a)));		
double x2=((-b-Math.sqrt(delta)/(2*a)));
if(a==0) {
	System.out.println("Não é equação de primeiro grau");	
}else {
	if(delta>=0) {
		System.out.printf("Raíz 1:%.2f",x);
		System.out.println("                ");
		System.out.printf("Raíz 2: %.2f",x2);		
	}else {
	System.out.println("Não há raízes reais");	
	}
}

}
}
