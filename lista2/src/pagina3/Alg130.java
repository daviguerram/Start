package pagina3;
import java.util.Scanner;
public class Alg130 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Informe o valor do produto em R$: ");		
double prod=leia.nextDouble();		
double luc;
if (prod<20) {
luc=(prod/100)*45;
prod=prod+luc;
System.out.println("Valor da venda: R$"+prod);
}else {
	luc=(prod/100)*30;
	prod=prod+luc;
System.out.println("Valor da venda: R$"+prod);
}
	}

}
