package pagina3;
import java.util.Scanner;
public class Alg127 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu nome completo: ");		
String nome=leia.nextLine();		
System.out.println("Digite a nota das suas duas provas: ");	
double pr1=leia.nextDouble();	
double pr2=leia.nextDouble();	
System.out.println("Nome: "+nome);	
System.out.println("PR1: "+pr1);	
System.out.println("PR2: "+pr2);	
	if((pr1+pr2)/2>=7) {
	System.out.println("Status: Aprovado");
	}else if((pr1+pr2)/2>=3 && (pr1+pr2)/2<7) {
	System.out.println("Status: Prova final");	
	}else {
		System.out.println("Status: Reprovado");
	}
	}

}
