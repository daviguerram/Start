package pagina1;
import java.util.Scanner;
public class Alg100{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número inteiro de 4 casas");
int num=leia.nextInt();
int uni=(num/1000)%10;
int cen = (num/100)%10;
int novo = uni*10+cen;
if (novo%4==0) {
System.out.println("O número formado pelos algarismos das unidades de milhar e das centenas é múltiplo de 4");
} else {
	System.out.println("O número formado pelos algarismos das unidades de milhar e das centenas não é múltiplo de 4.");


}}}