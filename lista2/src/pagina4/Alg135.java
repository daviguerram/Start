package pagina4;
import java.util.Scanner;
public class Alg135{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite sua idade: ");		
int ida=leia.nextInt();		
if (ida<16) {
	System.out.println("não-eleitor");
}else if(ida>=16 && ida<18 || ida>65) {
	System.out.println("eleitor facultativo");
}else {
System.out.println("eleitor obrigatório");	
	
	
	
	
	}

}}
