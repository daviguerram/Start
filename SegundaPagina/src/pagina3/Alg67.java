package pagina3;
import java.util.Scanner;
public class Alg67 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor da prestação em R$: ");
		double val=leia.nextDouble();
		System.out.println("Digite o valor da taxa de atraso em R$: ");
double taxa = leia.nextDouble();	
	System.out.println("Digite quantos dias o pagamento está atrasado:  ");
	int dia=leia.nextInt();
	double prest = val+(val*(taxa/100)*dia);
	System.out.printf("O valor da prestação em reais será de: %.2f",prest);
	
	
	}

}
