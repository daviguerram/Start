package pagina5;
import java.util.Scanner;
public class Alg140 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu primeiro nome: ");		
String nome=leia.nextLine();		
System.out.println("Digite o valor da conta: ");	
double conta=leia.nextDouble();	
if(nome.startsWith("A")|| nome.startsWith("D") || nome.startsWith("M") || nome.startsWith("S") ) {
double desc=(conta/100)*30;
conta=conta-desc;
System.out.printf("Com o desconto, o valor da conta vai para: R$ %.2f",conta);
}else {
	System.out.println("Que pena. Nessa semana o desconto não é para o seu nome, mas continue nos prestigiando que sua vez chegará.");
}
	
	
	
	}

}
