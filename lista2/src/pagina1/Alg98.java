package pagina1;
import java.util.Scanner;
public class Alg98{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite seu salário em R$: ");
double sal=leia.nextDouble();
System.out.println("Digite o valor da prestação em R$: ");
double pres=leia.nextDouble();
double ter=(sal/100)*30;
if (pres>ter) {
System.out.println("O empréstimo não pode ser concedido");
}else {
System.out.println("O empréstimo pode ser concedido");





}}}