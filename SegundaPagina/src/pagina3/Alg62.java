package pagina3;
import java.util.Scanner;
public class Alg62 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
	System.out.println("Digite o valor do produto em R$: " );	
	double valor=leia.nextDouble();	
	double desc= (valor/100)*9;	
	double novo = valor-desc;
	System.out.printf("O novo valor do produto com desconto em R$ é de: %.2f",novo);
	
	}

}
