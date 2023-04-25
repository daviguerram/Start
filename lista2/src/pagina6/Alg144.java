package pagina6;
import java.util.Scanner;
public class Alg144 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite o saldo médio da sua conta em R$: ");		
double sal=leia.nextDouble();
if(sal<=500) {
	System.out.println("Saldo médio: "+sal);
    System.out.println("Valor do crédito: Nenhum crédito");
}else if(sal>=501 && sal<=1000) {
	System.out.println("Saldo médio "+sal);
    System.out.println("Valor do crédito: 30%");
}else if(sal>=1001 && sal<=3000) {
	System.out.println("Saldo médio: "+sal);
    System.out.println("Valor do crédito: 40% ");
}else {
	System.out.println("Saldo médio: "+sal);
    System.out.println("Valor do crédito: 50%");
}

	}

}
