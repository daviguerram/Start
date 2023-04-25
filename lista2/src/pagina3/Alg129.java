package pagina3;
import java.util.Scanner;
public class Alg129 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu salário em R$: ");		
double sal=leia.nextDouble();		
if (sal<=600) {
	System.out.println("Você é isento de desconto do INSS");
}else if(sal>600 && sal<=1200) {
	System.out.println("Seu desconto do INSS é de 20%");
}else if(sal>1200 && sal<=2000) {
	System.out.println("Seu desconto do INSS é de 25%");
}else {
	System.out.println("Seu desconto do INSS é de 30%");
}
	
	
	
	}

}
