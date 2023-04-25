package pagina1;
import java.util.Scanner;
public class Alg99{

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
System.out.println("Digite um número de três casas decimais");
int num=leia.nextInt();
int cen=(num/100)%10;
if (cen%2==0) {
System.out.println("O algarismo da casa das centenas é par");
}else {
System.out.println("O algorismo da casa da centena é impar");
}








}}