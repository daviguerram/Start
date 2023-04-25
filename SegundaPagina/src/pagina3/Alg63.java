package pagina3;
import java.util.Scanner;
public class Alg63 {

	public static void main(String[] args) {
Scanner leia= new Scanner(System.in);
System.out.println("Digite o valor da sua hora aula em R$: ");		
double hora= leia.nextDouble();
System.out.println("Digite o número de aulas dadas: ");
double aula = leia.nextDouble();
System.out.println("Digite o percentual de desconto do INSS: ");
double inss = leia.nextDouble();	
double sal = (aula*hora);
double desc= (sal/100)*inss;
double novo=sal-desc;	
System.out.printf("Seu salário líquido em R$ será de: %.2f",novo);
	
	}

}
