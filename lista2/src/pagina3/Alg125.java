package pagina3;
import java.util.Scanner;
public class Alg125 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite sua idade: ");		
int ida=leia.nextInt();		
if (ida<18) {
System.out.println("Você é menor de idade");	
}else if(ida>=18 && ida<=65) {
	System.out.println("Você é maior de idade");
} else {
	System.out.println("Você é maior de 65 anos");
}
	
	
	}

}
